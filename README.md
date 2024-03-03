# Apache Kafka Demo Project

The project demonstrates how to send messages to and receive messages from locally installed Apache Kafka in a Spring Boot application.

Read the following quick start first. It also describes how to install Apache Kafka and start the Kafka environment.

https://kafka.apache.org/quickstart

## Start Kafka Environment

Go to the download directory for Apache Kafka, e.g., `kafka_2.13-3.7.0`.

Open the Terminal and run the following command.

`bin/zookeeper-server-start.sh config/zookeeper.properties`

Open another terminal session and run the following command.

`bin/kafka-server-start.sh config/server.properties`

Now, you are ready to go!