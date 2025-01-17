package org.jiamy.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.apache.ibatis.annotations.Options;
import org.jiamy.entity.BPatientInfo;
import org.jiamy.entity.User;
import org.jiamy.mapper.PatientMapper;
import org.jiamy.service.MyUserService;
import org.jiamy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @description:
 * @author: jiamy
 * @create: 2024/9/26 14:42
 **/
@Controller
@RequestMapping("/user")
public class UserController {

    public static final ThreadLocal<User> threadLocalUser = new ThreadLocal<>();

    @Autowired
    UserService userService; // field inject

    @Autowired
    MyUserService myUserService; // field inject

    @Autowired
    PatientMapper patientMapper;

    @GetMapping("/get")
    public String getById() {
        User user = userService.getByName("张三");
        System.out.println(user.getName());

        User user2 = myUserService.getByName("张三");
        System.out.println(user2.getName());

        System.out.println("getById");

        List<BPatientInfo> patientList = patientMapper.list();

        return "user";
    }



}
