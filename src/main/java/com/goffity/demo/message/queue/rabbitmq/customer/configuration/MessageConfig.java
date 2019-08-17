package com.goffity.demo.message.queue.rabbitmq.customer.configuration;

import com.goffity.demo.message.queue.rabbitmq.customer.services.MessageSender;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfig {
    @Bean
    public TopicExchange topic() {
        return new TopicExchange("customer.topic");
    }

    @Bean
    public MessageSender sender() {
        return new MessageSender();
    }
}
