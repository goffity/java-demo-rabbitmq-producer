package com.goffity.demo.message.queue.rabbitmq.customer.services;

import com.goffity.demo.message.queue.rabbitmq.customer.object.Customer;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageSender {
    @Autowired
    private TopicExchange topic;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void sendEmail(Customer customer) {
        String key = "email.customer";
        System.out.println(customer.toString());
        rabbitTemplate.convertAndSend(topic.getName(), key, customer.toString());
    }
}
