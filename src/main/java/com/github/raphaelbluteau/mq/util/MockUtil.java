package com.github.raphaelbluteau.mq.util;

import com.github.raphaelbluteau.mq.data.Message;
import com.github.raphaelbluteau.mq.data.Sender;
import java.time.LocalDateTime;

public class MockUtil {

  public static Message getDefaultMessage() {

    return Message.builder()
        .id("001")
        .content("An awesome message sent using ActiveMQ!")
        .createdAt(LocalDateTime.now())
        .sender(Sender.builder()
            .name("Raphael Carvalho")
            .email("raphaelbluteau@gmail.com")
            .build())
        .build();
  }
}
