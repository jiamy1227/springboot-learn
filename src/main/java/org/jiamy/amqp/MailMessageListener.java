package org.jiamy.amqp;

import jakarta.jms.Message;
import jakarta.jms.TextMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: jiamy
 * @create: 2024/10/14 15:56
 **/
@Component
public class MailMessageListener {
    final Logger logger = LoggerFactory.getLogger(getClass());

    // @JmsListener(destination = "jms/queue/mail", concurrency = "10")
    public void onMailMessageReceived(TextMessage message) throws Exception {
        logger.info("received message: " + message.getText());
    }
}
