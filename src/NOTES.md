/usr/lib/jvm/java-8-oracle/bin/java -javaagent:/home/telekosmos/.local/share/umake/ide/idea/lib/idea_rt.jar=46647:/home/telekosmos/.local/share/umake/ide/idea/bin -Dfile.encoding=UTF-8 -classpath /usr/lib/jvm/java-8-oracle/jre/lib/charsets.jar:/usr/lib/jvm/java-8-oracle/jre/lib/deploy.jar:/usr/lib/jvm/java-8-oracle/jre/lib/ext/cldrdata.jar:/usr/lib/jvm/java-8-oracle/jre/lib/ext/dnsns.jar:/usr/lib/jvm/java-8-oracle/jre/lib/ext/jaccess.jar:/usr/lib/jvm/java-8-oracle/jre/lib/ext/jfxrt.jar:/usr/lib/jvm/java-8-oracle/jre/lib/ext/localedata.jar:/usr/lib/jvm/java-8-oracle/jre/lib/ext/nashorn.jar:/usr/lib/jvm/java-8-oracle/jre/lib/ext/sunec.jar:/usr/lib/jvm/java-8-oracle/jre/lib/ext/sunjce_provider.jar:/usr/lib/jvm/java-8-oracle/jre/lib/ext/sunpkcs11.jar:/usr/lib/jvm/java-8-oracle/jre/lib/ext/zipfs.jar:/usr/lib/jvm/java-8-oracle/jre/lib/javaws.jar:/usr/lib/jvm/java-8-oracle/jre/lib/jce.jar:/usr/lib/jvm/java-8-oracle/jre/lib/jfr.jar:/usr/lib/jvm/java-8-oracle/jre/lib/jfxswt.jar:/usr/lib/jvm/java-8-oracle/jre/lib/jsse.jar:/usr/lib/jvm/java-8-oracle/jre/lib/management-agent.jar:/usr/lib/jvm/java-8-oracle/jre/lib/plugin.jar:/usr/lib/jvm/java-8-oracle/jre/lib/resources.jar:/usr/lib/jvm/java-8-oracle/jre/lib/rt.jar:/home/telekosmos/workon/kafka/kafka-initial-course/out/production/classes:/home/telekosmos/.gradle/caches/modules-2/files-2.1/org.apache.kafka/kafka-clients/2.1.0/34d9983705c953b97abb01e1cd04647f47272fe5/kafka-clients-2.1.0.jar:/home/telekosmos/.gradle/caches/modules-2/files-2.1/org.slf4j/slf4j-simple/1.7.25/8dacf9514f0c707cbbcdd6fd699e8940d42fb54e/slf4j-simple-1.7.25.jar:/home/telekosmos/.gradle/caches/modules-2/files-2.1/com.github.luben/zstd-jni/1.3.5-4/550b6393a007d0867c98611ca8cfbcf53f2eb991/zstd-jni-1.3.5-4.jar:/home/telekosmos/.gradle/caches/modules-2/files-2.1/org.lz4/lz4-java/1.5.0/d36fb639f06aaa4f17307625f80e2e32f815672a/lz4-java-1.5.0.jar:/home/telekosmos/.gradle/caches/modules-2/files-2.1/org.xerial.snappy/snappy-java/1.1.7.2/307b286efd119ad2c6d4291128bf110bddc68088/snappy-java-1.1.7.2.jar:/home/telekosmos/.gradle/caches/modules-2/files-2.1/org.slf4j/slf4j-api/1.7.25/da76ca59f6a57ee3102f8f9bd9cee742973efa8a/slf4j-api-1.7.25.jar com.telekosmos.dev.kafka.ConsumerDemo
[main] INFO org.apache.kafka.clients.consumer.ConsumerConfig - ConsumerConfig values:
	auto.commit.interval.ms = 5000
	auto.offset.reset = earliest
	bootstrap.servers = [localhost:9092]
	check.crcs = true
	client.dns.lookup = default
	client.id =
	connections.max.idle.ms = 540000
	default.api.timeout.ms = 60000
	enable.auto.commit = true
	exclude.internal.topics = true
	fetch.max.bytes = 52428800
	fetch.max.wait.ms = 500
	fetch.min.bytes = 1
	group.id = com.telekosmos.dev.kafka.ConsumerDemo
	heartbeat.interval.ms = 3000
	interceptor.classes = []
	internal.leave.group.on.close = true
	isolation.level = read_uncommitted
	key.deserializer = class org.apache.kafka.common.serialization.StringDeserializer
	max.partition.fetch.bytes = 1048576
	max.poll.interval.ms = 300000
	max.poll.records = 500
	metadata.max.age.ms = 300000
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	partition.assignment.strategy = [class org.apache.kafka.clients.consumer.RangeAssignor]
	receive.buffer.bytes = 65536
	reconnect.backoff.max.ms = 1000
	reconnect.backoff.ms = 50
	request.timeout.ms = 30000
	retry.backoff.ms = 100
	sasl.client.callback.handler.class = null
	sasl.jaas.config = null
	sasl.kerberos.kinit.cmd = /usr/bin/kinit
	sasl.kerberos.min.time.before.relogin = 60000
	sasl.kerberos.service.name = null
	sasl.kerberos.ticket.renew.jitter = 0.05
	sasl.kerberos.ticket.renew.window.factor = 0.8
	sasl.login.callback.handler.class = null
	sasl.login.class = null
	sasl.login.refresh.buffer.seconds = 300
	sasl.login.refresh.min.period.seconds = 60
	sasl.login.refresh.window.factor = 0.8
	sasl.login.refresh.window.jitter = 0.05
	sasl.mechanism = GSSAPI
	security.protocol = PLAINTEXT
	send.buffer.bytes = 131072
	session.timeout.ms = 10000
	ssl.cipher.suites = null
	ssl.enabled.protocols = [TLSv1.2, TLSv1.1, TLSv1]
	ssl.endpoint.identification.algorithm = https
	ssl.key.password = null
	ssl.keymanager.algorithm = SunX509
	ssl.keystore.location = null
	ssl.keystore.password = null
	ssl.keystore.type = JKS
	ssl.protocol = TLS
	ssl.provider = null
	ssl.secure.random.implementation = null
	ssl.trustmanager.algorithm = PKIX
	ssl.truststore.location = null
	ssl.truststore.password = null
	ssl.truststore.type = JKS
	value.deserializer = class org.apache.kafka.common.serialization.StringDeserializer

[main] INFO org.apache.kafka.common.utils.AppInfoParser - Kafka version : 2.1.0
[main] INFO org.apache.kafka.common.utils.AppInfoParser - Kafka commitId : eec43959745f444f
[main] INFO org.apache.kafka.clients.Metadata - Cluster ID: FNQNzFs9ReKCcFhg-CM5Lg
[main] INFO org.apache.kafka.clients.consumer.internals.AbstractCoordinator - [Consumer clientId=consumer-1, groupId=com.telekosmos.dev.kafka.ConsumerDemo] Discovered group coordinator localhost:9092 (id: 2147482646 rack: null)
[main] INFO org.apache.kafka.clients.consumer.internals.ConsumerCoordinator - [Consumer clientId=consumer-1, groupId=com.telekosmos.dev.kafka.ConsumerDemo] Revoking previously assigned partitions []
[main] INFO org.apache.kafka.clients.consumer.internals.AbstractCoordinator - [Consumer clientId=consumer-1, groupId=com.telekosmos.dev.kafka.ConsumerDemo] (Re-)joining group
[main] INFO org.apache.kafka.clients.consumer.internals.AbstractCoordinator - [Consumer clientId=consumer-1, groupId=com.telekosmos.dev.kafka.ConsumerDemo] Successfully joined group with generation 1
[main] INFO org.apache.kafka.clients.consumer.internals.ConsumerCoordinator - [Consumer clientId=consumer-1, groupId=com.telekosmos.dev.kafka.ConsumerDemo] Setting newly assigned partitions [java-topic-1, java-topic-0, java-topic-2]
[main] INFO org.apache.kafka.clients.consumer.internals.Fetcher - [Consumer clientId=consumer-1, groupId=com.telekosmos.dev.kafka.ConsumerDemo] Resetting offset for partition java-topic-1 to offset 0.
[main] INFO org.apache.kafka.clients.consumer.internals.Fetcher - [Consumer clientId=consumer-1, groupId=com.telekosmos.dev.kafka.ConsumerDemo] Resetting offset for partition java-topic-0 to offset 0.
[main] INFO org.apache.kafka.clients.consumer.internals.Fetcher - [Consumer clientId=consumer-1, groupId=com.telekosmos.dev.kafka.ConsumerDemo] Resetting offset for partition java-topic-2 to offset 0.
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: null, val: Initial message, part: 1, offset: 0
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: null, val: Initial message, part: 1, offset: 1
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: null, val: Initial metadata message, part: 1, offset: 2
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: null, val: New metadata message, part: 1, offset: 3
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: null, val: New metadata message 2, part: 1, offset: 4
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: null, val: Loop metadata message 0 (Sun Jan 27 20:11:51 CET 2019), part: 1, offset: 5
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: null, val: Loop metadata message 3 (Sun Jan 27 20:11:52 CET 2019), part: 1, offset: 6
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: null, val: Loop metadata message 6 (Sun Jan 27 20:11:52 CET 2019), part: 1, offset: 7
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: null, val: Loop metadata message 9 (Sun Jan 27 20:11:52 CET 2019), part: 1, offset: 8
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_8, val: Value 8, part: 1, offset: 9
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_11, val: Value 11, part: 1, offset: 10
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_8, val: {value: 8}, part: 1, offset: 11
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_11, val: {value: 11}, part: 1, offset: 12
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_8, val: {value: 16}, part: 1, offset: 13
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_11, val: {value: 22}, part: 1, offset: 14
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: null, val: Initial message, part: 0, offset: 0
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: null, val: New metadata message (Sun Jan 27 00:07:59 CET 2019), part: 0, offset: 1
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: null, val: Loop metadata message 1 (Sun Jan 27 20:11:52 CET 2019), part: 0, offset: 2
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: null, val: Loop metadata message 4 (Sun Jan 27 20:11:52 CET 2019), part: 0, offset: 3
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: null, val: Loop metadata message 7 (Sun Jan 27 20:11:52 CET 2019), part: 0, offset: 4
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: null, val: Loop metadata message 10 (Sun Jan 27 20:11:52 CET 2019), part: 0, offset: 5
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_1, val: Value 1, part: 0, offset: 6
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_3, val: Value 3, part: 0, offset: 7
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_6, val: Value 6, part: 0, offset: 8
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_1, val: {value: 1}, part: 0, offset: 9
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_3, val: {value: 3}, part: 0, offset: 10
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_6, val: {value: 6}, part: 0, offset: 11
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_1, val: {value: 2}, part: 0, offset: 12
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_3, val: {value: 6}, part: 0, offset: 13
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_6, val: {value: 12}, part: 0, offset: 14
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: null, val: New metadata message (offset), part: 2, offset: 0
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: null, val: New metadata message (Sun Jan 27 00:07:03 CET 2019), part: 2, offset: 1
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: null, val: Loop metadata message 2 (Sun Jan 27 20:11:52 CET 2019), part: 2, offset: 2
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: null, val: Loop metadata message 5 (Sun Jan 27 20:11:52 CET 2019), part: 2, offset: 3
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: null, val: Loop metadata message 8 (Sun Jan 27 20:11:52 CET 2019), part: 2, offset: 4
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: null, val: Loop metadata message 11 (Sun Jan 27 20:11:52 CET 2019), part: 2, offset: 5
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_2, val: Value 2, part: 2, offset: 6
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_4, val: Value 4, part: 2, offset: 7
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_5, val: Value 5, part: 2, offset: 8
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_7, val: Value 7, part: 2, offset: 9
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_9, val: Value 9, part: 2, offset: 10
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_10, val: Value 10, part: 2, offset: 11
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_12, val: Value 12, part: 2, offset: 12
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_2, val: {value: 2}, part: 2, offset: 13
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_4, val: {value: 4}, part: 2, offset: 14
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_5, val: {value: 5}, part: 2, offset: 15
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_7, val: {value: 7}, part: 2, offset: 16
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_9, val: {value: 9}, part: 2, offset: 17
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_10, val: {value: 10}, part: 2, offset: 18
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_12, val: {value: 12}, part: 2, offset: 19
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_2, val: {value: 4}, part: 2, offset: 20
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_4, val: {value: 8}, part: 2, offset: 21
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_5, val: {value: 10}, part: 2, offset: 22
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_7, val: {value: 14}, part: 2, offset: 23
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_9, val: {value: 18}, part: 2, offset: 24
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_10, val: {value: 20}, part: 2, offset: 25
[main] INFO com.telekosmos.dev.kafka.ConsumerDemo - key: id_12, val: {value: 24}, part: 2, offset: 26
