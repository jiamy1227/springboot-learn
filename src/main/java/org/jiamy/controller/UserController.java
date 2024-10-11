package org.jiamy.controller;

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

    @Autowired
    UserService userService; // field inject

    @GetMapping("/get")
    public String getById(@RequestParam("id") String id, Model model) {
        model.addAttribute("user", userService.getById(id));
        System.out.println(id);
        return "user";
    }


}
