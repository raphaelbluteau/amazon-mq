package com.github.raphaelbluteau.mq;

import com.github.raphaelbluteau.mq.util.MockUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
@EnableJms
public class MqApplication {

  public static void main(String[] args) {

    ConfigurableApplicationContext context = SpringApplication.run(MqApplication.class, args);

    JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);

    jmsTemplate.convertAndSend("inbox", MockUtil.getDefaultMessage());

  }
}
