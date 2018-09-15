package com.fersanp.gleidson.kafkaexample.consumer;

import com.fersanp.gleidson.kafkaexample.Person;
import org.springframework.kafka.annotation.KafkaListener;

public class KafkaConsumer {

    @KafkaListener(topics = "${app.topic.my-topic-test}", clientIdPrefix = "${spring.kafka.client-id}", groupId = "${spring.kafka.group-id}")
    public void listen(Person person) {
        System.out.println("Received Messasge in group ${spring.kafka.group-id}: " + person);
    }
}
