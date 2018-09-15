package com.fersanp.gleidson.kafkaexample;

import com.fersanp.gleidson.kafkaexample.service.KafkaProducesService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KafkaSenderTest {

    @Autowired
    private KafkaProducesService kafkaProducesService;

    @Test
    public void sendMessageTest(){

        kafkaProducesService.sendMessage(new Person("id","Deyse","FerSanP","email@email.com"));
    }

}
