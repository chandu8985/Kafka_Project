package com.KafkaProjectExampleProducer.Producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class KafkaMessagePublisher {

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;


    public void sendMessageToTOpic(String message){
      CompletableFuture<SendResult<String,Object>> future = kafkaTemplate.send("chand3",message);

      future.whenComplete((res , ex)-> {
if (ex==null){
    System.out.println("sent message =[ "+message+"] with offset Value is[ "+res.getRecordMetadata().offset()+"]");
}else {
    System.out.println("unable to send the message =[ " + message+ "]due to this error : "+ex.getMessage());
}
        });

    };

    }

