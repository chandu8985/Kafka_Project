package com.KafkaProjectExampleProducer.Producer.controller;

import com.KafkaProjectExampleProducer.Producer.service.KafkaMessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer-app")
public class EventController {

    @Autowired
    private KafkaMessagePublisher publisherone;

    @GetMapping("publish/{message}")
    public ResponseEntity<?> publishMessage(@PathVariable() String message) {
        try {
            for (int i = 0; i <= 100; i++) {
                publisherone.sendMessageToTOpic(message + " : " + i);
                return ResponseEntity.ok("Published Successfully Congratulation ... ");
            }
        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .build();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
}