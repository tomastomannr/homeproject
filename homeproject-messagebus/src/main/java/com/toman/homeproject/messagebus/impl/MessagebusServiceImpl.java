package com.toman.homeproject.messagebus.impl;

import com.toman.homeproject.messagebus.MessagebusService;
import com.toman.homeproject.messagebus.model.BillBO;
import com.toman.homeproject.messagebus.producer.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessagebusServiceImpl implements MessagebusService {

    private final Sender sender;

    @Autowired
    public MessagebusServiceImpl(final Sender sender) {
        this.sender = sender;
    }

    @Override
    public void send(BillBO message) {
        sender.send(message);
    }
}
