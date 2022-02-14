package com.cognizant.producer.controllers;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static com.cognizant.producer.configuration.AmpqConfig.QUEUE_NAME;

@RestController
public class ProducerController {
    private final RabbitTemplate rabbitTemplate;

    public ProducerController(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @PostMapping("/send")
    public void sendMessageToQueue(@RequestBody String message) {
        rabbitTemplate.convertAndSend(QUEUE_NAME, message);
    }
}
