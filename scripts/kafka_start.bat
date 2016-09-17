cd D:\apps\kafka_2.10-0.10.0.0

start .\bin\windows\zookeeper-server-start.bat config\zookeeper.properties
start .\bin\windows\kafka-server-start.bat config\server.properties
start .\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic test
start .\bin\windows\kafka-console-consumer.bat --zookeeper localhost:2181 --topic test