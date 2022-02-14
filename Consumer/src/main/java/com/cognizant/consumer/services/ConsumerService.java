package com.cognizant.consumer.services;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @RabbitListener(queues = "myQueue")
    public void listen(String message) {
        System.out.println("Message read: " + message);
    }

}
