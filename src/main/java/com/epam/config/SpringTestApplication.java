package com.epam.config;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.util.Properties;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@SpringBootApplication(scanBasePackages = {
		"com.epam.controller",
		"com.epam.service"
})
public class SpringTestApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SpringTestApplication.class, args);
	}

	//        producer.close(); TODO

	@Bean
	public Producer kafkaProducer() {
		Properties props = new Properties();

		props.put("bootstrap.servers", "localhost:9092");
		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("request.required.acks", "1");

		Producer<String, String> producer = new KafkaProducer<>(props);
		return producer;
	}

	@Bean
	public ObjectMapper objectMapper() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
		mapper.findAndRegisterModules();
		return mapper;
	}

}
