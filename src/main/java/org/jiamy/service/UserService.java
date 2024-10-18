package org.jiamy.service;

import org.jiamy.amqp.AMQPMessageervice;
import org.jiamy.amqp.JMSMessageService;
import org.jiamy.entity.User;
import org.jiamy.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: jiamy
 * @create: 2024/9/26 15:28
 **/
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    //@Autowired
    JMSMessageService jmsMessageService;

    @Autowired
    AMQPMessageervice amqpMessageervice;

    public User getById(String id){
        try {
            jmsMessageService.sendMailMessage();
        } catch (Exception e) {
            System.out.println("jms error!");
        }

        return userMapper.getById(id);
    }

    public User getByName(String name){
        return userMapper.getByName(name);
    }

    public void sendLoginMessage(){
        amqpMessageervice.sendLoginMessage();
    }

    public void sendRegistrationMessage(){
        amqpMessageervice.sendRegistrationMessage();
    }
}
