package org.jiamy.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.apache.ibatis.annotations.Options;
import org.jiamy.entity.User;
import org.jiamy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/get")
    @Operation(summary = "user getById")
    public String getById(@RequestParam("id") String id, Model model) {
        User user = new User();
        user.setName("user in ThreadLocal:" + System.currentTimeMillis());

        threadLocalUser.set(user);
        System.out.println("Thread in UserController: " + Thread.currentThread().getId());

        User user2 = userService.getById(id);
        model.addAttribute("user", user2);
        System.out.println(id);
        System.out.println("清除ThreadLocal中的对象");
        // threadLocalUser.remove();
        return "user";
    }



}
