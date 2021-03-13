package com.saket.rabbitmqdemowithexchange.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.saket.rabbitmqdemowithexchange.config.QueueConfig;
import com.saket.rabbitmqdemowithexchange.vo.CustomMessage;

@Component
public class MessageListener {

    @RabbitListener(queues = QueueConfig.QUEUE)
    public void listener(CustomMessage message) {
        System.out.println("Message Received: " + message.toString());
    }

}