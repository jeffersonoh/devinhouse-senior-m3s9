package com.example.spring.producer.service.implementation;

import com.example.spring.producer.amqp.AmqpProducer;
import com.example.spring.producer.dto.MessageQueue;
import com.example.spring.producer.service.AmqpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQServiceImpl implements AmqpService {

//nossas implementações aqui ...

    @Override
    public void sendToConsumer(MessageQueue message) {

    }
}