package com.saket.rabbitmqdemowithexchange.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomMessage {

    private String messageId;
    private String message;
    private Date messageDate;

}