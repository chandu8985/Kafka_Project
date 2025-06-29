package com.KafkaProjectExampleProducer.Producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaProducerConfig {
    /* we are not creating topic by command rather we are using by code
    this is used to create a topic if we want to create based on the code if we have
           own tool it is not required if we have to create throught code need to follow like this*/

    @Bean
    public NewTopic createNewTopic(){
    // here we have the kafka topic name and partition count and refactring no also we can specify like this
    return new NewTopic("KafkaProjectExampleProducerTopic",1,(short) 1);
}
}
