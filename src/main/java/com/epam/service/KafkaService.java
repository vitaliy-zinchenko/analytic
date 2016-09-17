package com.epam.service;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private Producer producer;

    public void send(String message) {
        ProducerRecord<String, String> data = new ProducerRecord<>("test", message);
        producer.send(data);
    }

}
