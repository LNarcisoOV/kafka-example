package com.kafka.exp.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
	
	@KafkaListener(topics = "topic-example", groupId = "groupId")
	public void listener(String data) {
		System.out.println("Received data from kafka: " + data);
	}

}
