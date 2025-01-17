package org.jiamy.service;

import org.jiamy.controller.UserController;
import org.jiamy.entity.User;
import org.jiamy.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @author: jiamy
 * @create: 2024/9/26 15:28
 **/
@Service
@Transactional
public class MyUserServiceImpl implements MyUserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public User getById(String id){

        System.out.println("Thread in UserService: " + Thread.currentThread().getId());

        System.out.println(UserController.threadLocalUser.get().getName());

        return userMapper.getById(id);
    }

    @Override
    public User getByName(String name){
        return userMapper.getByName(name);
    }
}
