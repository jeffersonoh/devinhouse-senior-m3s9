package com.example.spring.producer.amqp.implementation;

import com.example.spring.producer.amqp.AmqpProducer;
import com.example.spring.producer.dto.MessageQueue;
import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProducerRabbitMQ implements AmqpProducer<MessageQueue> {

    // inserir nossa implementação aqui ...

    @Override
    public void producer(MessageQueue messageQueue) {

    }
}


