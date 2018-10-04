package com.github.raphaelbluteau.mq.receiver;

import com.github.raphaelbluteau.mq.data.Message;

public interface MessageReceiver {

  void receiveMessage(Message message);
}
