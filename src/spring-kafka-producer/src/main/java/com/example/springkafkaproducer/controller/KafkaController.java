package com.example.springkafkaproducer.controller;

import com.example.springkafkaproducer.model.Message;
import com.example.springkafkaproducer.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/JSON", produces="application/json")
@CrossOrigin(origins="*")
public class KafkaController {

    Message message = new Message();


    @GetMapping("/data")
    public Message get() {

        message.setBaslik("baslik");
        message.setIsim("emir");
        message.setYas("21");
        message.setMesaj("acik kaynak kodlu yazılımlar");

        return message;
    }

    @GetMapping("/{id}/{name}/{data}")
    public ResponseEntity<Message> getData(@PathVariable("id") String id,
                                           @PathVariable("name") String name,
                                           @PathVariable("data") String data) {

        Message user = new Message();
        message.setBaslik("baslik");
        message.setIsim("emir");
        message.setYas("21");
        message.setMesaj("acik kaynak kodlu yazılımlar");


        HttpHeaders headers = new HttpHeaders();

        ResponseEntity<Message> entity = new ResponseEntity<>(user, headers, HttpStatus.CREATED);
        publishMessage(message);
        return entity;
    }

    @Autowired
    KafkaProducerService kafkaProducerService;

    @PostMapping("publish")
    public void publishMessage(@RequestBody Message msg) {
        kafkaProducerService.sendMessage(msg);
    }
}



