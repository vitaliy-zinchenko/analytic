To run kafka on windows

.\bin\windows\zookeeper-server-start.bat config\zookeeper.properties
.\bin\windows\kafka-server-start.bat config\server.properties
.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic test
.\bin\windows\kafka-console-consumer.bat --zookeeper localhost:2181 --topic test --from-beginning