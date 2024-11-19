package org.jiamy;

import org.jiamy.entity.Son;
import org.jiamy.entity.User;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.BeanUtils;

import java.util.Optional;

/**
 * @description:
 * @author: jiamy
 * @create: 2024/11/13 14:00
 **/
public class Test {

    public static void main(String[] args) {

        String s1 = "abc";

        String s2 = "def";

        User u1 = new User("张三",20);

        Son son = new Son("张三儿");

        User u2 = new User();


        BeanUtils.copyProperties(u1,u2);

        u1.setName("李四");

        u1.setAge(50);

        method(u1);


        System.out.println(u2.toString());



    }

    static void method(User user){
        user = new User();
    }
}
