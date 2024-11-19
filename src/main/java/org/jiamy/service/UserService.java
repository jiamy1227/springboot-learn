package org.jiamy.service;

import org.jiamy.amqp.AMQPMessageervice;
import org.jiamy.amqp.JMSMessageService;
import org.jiamy.controller.UserController;
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


    public User getById(String id){

        System.out.println("Thread in UserService: " + Thread.currentThread().getId());

        System.out.println(UserController.threadLocalUser.get().getName());

        return userMapper.getById(id);
    }

    public User getByName(String name){
        return userMapper.getByName(name);
    }
}
