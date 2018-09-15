package com.fersanp.gleidson.kafkaexample.service;

import com.fersanp.gleidson.kafkaexample.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducesService {

    @Value("${app.topic.my-topic-test}")
    private String topicName;

    @Autowired
    private KafkaTemplate<String, Person> kafkaTemplate;

    public void sendMessage(Person person) {
        kafkaTemplate.send(topicName, person);
    }
}
