package com.telekosmos.dev.kafka;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.errors.WakeupException;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Calendar;
import java.util.Collections;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;

public class ConsumerThreadingDemo {
	private final static String GROUP_ID = ConsumerThreadingDemo.class.getSimpleName();
	private final static String BOOTSTRAP_SERVERS = "localhost:9092";
	private final static String TOPIC = "java-topic";

	private Logger logger = LoggerFactory.getLogger(ConsumerThreadingDemo.class.getName());

	private ConsumerThreadingDemo() {
	}

	public static void main(String[] args) {
		new ConsumerThreadingDemo().run();
	}

	private void run() {
		CountDownLatch latch = new CountDownLatch(1);
		Runnable consumerRunnable = new ConsumerThread(latch);

		Thread thread = new Thread(consumerRunnable);
		thread.start();

		// add shutdown hook
		Runtime.getRuntime().addShutdownHook(new Thread(() -> {
			logger.info("Shutdown hook!!");
			((ConsumerThread) consumerRunnable).shutdown();
			try {
				latch.await();
			} catch (InterruptedException e) {
				logger.info("Application has exited");
			}
		}));

		try {
			latch.await();
		} catch (InterruptedException e) {
			logger.error("Application got interrupted", e);
		} finally {
			logger.info("Application is closing");
		}
	}

	public class ConsumerThread implements Runnable {

		private CountDownLatch latch;
		private KafkaConsumer<String, String> consumer;
		private final Logger logger = LoggerFactory.getLogger(ConsumerThread.class);

		public ConsumerThread(CountDownLatch latch) {
			this.latch = latch;

			Properties props = new Properties();
			props.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVERS);
			props.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
			props.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
			props.setProperty(ConsumerConfig.GROUP_ID_CONFIG, GROUP_ID);
			props.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

			consumer = new KafkaConsumer<String, String>(props);
			consumer.subscribe(Collections.singletonList(TOPIC));
		}

		@Override
		public void run() {
			try {
				while (true) {
					ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
					for (ConsumerRecord r: records) {
						logger.info("key: " + r.key()+", val: "+r.value()+", part: "+r.partition()+", offset: "+r.offset());
					}
				}
			}
			catch (WakeupException ex) { // expected exception
				logger.info("Received shutdown signal");
			}
			finally {
				logger.info("App is closing...");
				consumer.close();
			}
		}

		public void shutdown() {
			consumer.wakeup();
			latch.countDown(); // in order the main method (invoking await) move on -> then finish
		}
	}
}
