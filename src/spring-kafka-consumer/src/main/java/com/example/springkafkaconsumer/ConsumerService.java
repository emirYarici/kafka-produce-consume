package com.example.springkafkaconsumer;

import com.example.springkafkaconsumer.model.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @KafkaListener(topics = "aciky")
    public void consumeMessage(Message message){

        System.out.println("Received message" + message.toString());
    }
}
