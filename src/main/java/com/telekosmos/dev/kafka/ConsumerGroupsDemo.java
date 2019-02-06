package com.telekosmos.dev.kafka;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.Calendar;
import java.util.Collections;
import java.util.Properties;

// Just for experimenting on consumer groups re-balancing
public class ConsumerGroupsDemo {
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(ConsumerGroupsDemo.class);
		Calendar cal = Calendar.getInstance();
		final String GROUP_ID = ConsumerGroupsDemo.class.getName();
		final String BOOTSTRAP_SERVERS = "localhost:9092";
		final String TOPIC = "java-topic";

		Properties props = new Properties();
		props.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, BOOTSTRAP_SERVERS);
		props.setProperty(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
		props.setProperty(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
		props.setProperty(ConsumerConfig.GROUP_ID_CONFIG, GROUP_ID);
		props.setProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

		KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(props);
		consumer.subscribe(Collections.singletonList(TOPIC));

		while (true) {
			ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
			for (ConsumerRecord r: records) {
				logger.info("key: " + r.key()+", val: "+r.value()+", part: "+r.partition()+", offset: "+r.offset());
			}
		}
	}
}
