package org.jiamy.amqp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: jiamy
 * @create: 2024/10/15 16:19
 **/
@Component
public class QueueMessageListener {
    final Logger logger = LoggerFactory.getLogger(getClass());

    static final String QUEUE_MAIL = "q_mail";
    static final String QUEUE_SMS = "q_sms";
    static final String QUEUE_APP = "q_app";

    @RabbitListener(queues = QUEUE_MAIL)
    public void onRegistrationMessageFromMailQueue(String message) throws Exception {
        logger.info("queue {} received registration message: {}", QUEUE_MAIL, message);
    }

    @RabbitListener(queues = QUEUE_SMS)
    public void onRegistrationMessageFromSmsQueue(String message) throws Exception {
        logger.info("queue {} received registration message: {}", QUEUE_SMS, message);
    }

    @RabbitListener(queues = QUEUE_MAIL)
    public void onLoginMessageFromMailQueue(String message) throws Exception {
        logger.info("queue {} received message: {}", QUEUE_MAIL, message);
    }

    @RabbitListener(queues = QUEUE_SMS)
    public void onLoginMessageFromSmsQueue(String message) throws Exception {
        logger.info("queue {} received message: {}", QUEUE_SMS, message);
    }

    @RabbitListener(queues = QUEUE_APP)
    public void onLoginMessageFromAppQueue(String message) throws Exception {
        logger.info("queue {} received message: {}", QUEUE_APP, message);
    }
}
