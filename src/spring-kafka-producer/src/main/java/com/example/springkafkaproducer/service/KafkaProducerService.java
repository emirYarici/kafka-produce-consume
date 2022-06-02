package com.example.springkafkaproducer.service;

import com.example.springkafkaproducer.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
    @Autowired
    KafkaTemplate<String,Message> kafkaTemplate;
    public void sendMessage(Message msg){
        kafkaTemplate.send("aciky",msg);
    }
}
