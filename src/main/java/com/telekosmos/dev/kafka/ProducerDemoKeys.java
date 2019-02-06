package com.telekosmos.dev.kafka;

import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class ProducerDemoKeys {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		Logger logger = LoggerFactory.getLogger(ProducerDemoKeys.class);
		Calendar cal = Calendar.getInstance();
		final String TOPIC = "java-topic";

		Properties props = new Properties();
		props.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		props.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		props.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

		KafkaProducer<String, String> producer = new KafkaProducer<String, String>(props);

		for (int i=1; i<=12; i++) {
			cal.setTime(new Date());
			cal.add(Calendar.SECOND, 2);
			Date newdate = cal.getTime();
			String value = "{value: " + Integer.toString(i*4)+", thread: true}";
			String key = "id_"+Integer.toString(i);

			logger.info("Key: "+key);
			ProducerRecord<String, String> record =	new ProducerRecord<>(TOPIC, key, value);
			producer.send(record, new Callback() {
				@Override
				public void onCompletion(RecordMetadata metadata, Exception exception) {
					if (exception == null) {
						logger.info("Metadata received :=> "
							+ "Partition: " + metadata.partition() + " - "
							+ "Offset: " + metadata.offset());
					} else {
						logger.error("Producer error", exception);
					}
				}
			}).get();
		}
		// producer.flush();
		producer.close();
	}
}
