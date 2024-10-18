package org.jiamy.amqp;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: jiamy
 * @create: 2024/10/15 16:08
 **/
@Component
public class AMQPMessageervice {

    @Autowired
    RabbitTemplate rabbitTemplate;

    public void sendRegistrationMessage() {
        rabbitTemplate.convertAndSend("registration", "", "注册成功");
    }

    public void sendLoginMessage() {
        rabbitTemplate.convertAndSend("login", "login_failed", "登陆失败");
    }
}
