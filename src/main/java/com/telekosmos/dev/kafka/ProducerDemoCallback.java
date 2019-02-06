package com.telekosmos.dev.kafka;

import org.apache.kafka.clients.producer.*;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

public class ProducerDemoCallback {
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(ProducerDemoCallback.class);
		Calendar cal = Calendar.getInstance();

		Properties props = new Properties();
		props.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		props.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		props.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

		KafkaProducer<String, String> producer = new KafkaProducer<String, String>(props);

		for (int i=0; i<12; i++) {
			cal.setTime(new Date());
			cal.add(Calendar.SECOND, 2);
			Date newdate = cal.getTime();

			ProducerRecord<String, String> record =
				new ProducerRecord<>("java-topic", "Loop metadata message "+i+" (" + newdate.toString() + ")");
			producer.send(record, new Callback() {
				@Override
				public void onCompletion(RecordMetadata metadata, Exception exception) {
					if (exception == null) {
						logger.info("Metadata received :=> "
							+ "Topic: " + metadata.topic() + " - "
							+ "Partition: " + metadata.partition() + " - "
							+ "Offset: " + metadata.offset());
					} else {
						logger.error("Producer error", exception);
					}
				}
			});
		}
		// producer.flush();
		producer.close();
	}
}
