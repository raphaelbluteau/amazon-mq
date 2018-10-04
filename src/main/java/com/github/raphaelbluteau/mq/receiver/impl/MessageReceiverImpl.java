package com.github.raphaelbluteau.mq.receiver.impl;

import com.github.raphaelbluteau.mq.receiver.MessageReceiver;
import com.github.raphaelbluteau.mq.data.Message;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiverImpl implements MessageReceiver {

  @Override
  @JmsListener(destination = "inbox", containerFactory = "myFactory")
  public void receiveMessage(Message message) {
    System.out.println(String.format("Received message: %s", message));
  }
}
