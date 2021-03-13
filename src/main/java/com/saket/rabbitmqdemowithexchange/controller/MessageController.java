package com.saket.rabbitmqdemowithexchange.controller;

import java.util.Date;
import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saket.rabbitmqdemowithexchange.config.QueueConfig;
import com.saket.rabbitmqdemowithexchange.vo.CustomMessage;

@RestController
@RequestMapping("/rabbit-queue")
public class MessageController {


    @Autowired
    private RabbitTemplate template;

    @GetMapping("/publish/{messageDesc}")
    public String publishMessage(@PathVariable String messageDesc) {
        CustomMessage message = new CustomMessage();
    	message.setMessageId(UUID.randomUUID().toString());
        message.setMessageDate(new Date());
        message.setMessage(messageDesc);

        template.convertAndSend(QueueConfig.EXCHANGE,
        		QueueConfig.ROUTING_KEY, message);

        return "Message Published";
    }
}