# Kafka_Project Producer
Kafka_Project Demo to publish and consume the data


Kafka-Project-Commands and why used
Start Zookeeper Server

sh bin/zookeeper-server-start.bat config/zookeeper.properties

Start Kafka Server / Broker

sh bin/kafka-server-start.bat config/server.properties

Create topic

sh bin/kafka-topics.bat --bootstrap-server localhost:9092 --create --topic NewTopic --partitions 3 --replication-factor 1

list out all topic names

sh bin/kafka-topics.bat --bootstrap-server localhost:9092 --list

Describe topics

sh bin/kafka-topics.bat --bootstrap-server localhost:9092 --describe --topic NewTopic

Produce message

sh bin/kafka-console-producer.bat --broker-list localhost:9092 --topic NewTopic

consume message

sh bin/kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic NewTopic --from-beginning

Confluent Kafka Community Edition in local Start Zookeeper Server

bin/zookeeper-server-start etc/kafka/zookeeper.properties

Start Kafka Server / Broker

bin/kafka-server-start etc/kafka/server.properties

Create topic

bin/kafka-topics --bootstrap-server localhost:9092 --create --topic NewTopic1 --partitions 3 --replication-factor 1

list out all topic names

bin/kafka-topics --bootstrap-server localhost:9092 --list

Describe topics

bin/kafka-topics --bootstrap-server localhost:9092 --describe --topic NewTopic1

Produce message

bin/kafka-console-producer --broker-list localhost:9092 --topic NewTopic1

consume message

bin/kafka-console-consumer --bootstrap-server localhost:9092 --topic NewTopic1 --from-beginning

Send CSV File data to kafka

bin/kafka-console-producer --broker-list localhost:9092 --topic NewTopic1 <bin/customers.csv
