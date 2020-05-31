package com.toman.homeproject.messagebus.producer.impl;

import com.toman.homeproject.messagebus.messaging.MultiOutputChannel;
import com.toman.homeproject.messagebus.producer.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Service;

@EnableBinding(MultiOutputChannel.class)
@Service
public class SenderImpl implements Sender {

    private final MultiOutputChannel channel;

    @Autowired
    public SenderImpl(final MultiOutputChannel channel) {
        this.channel = channel;
    }

    @Override
    public void send(String message) {
        try{
            channel.outputChannelOne().send(MessageBuilder.withPayload(message).build());
        }catch(Exception ex){
            System.out.println("aaa");
        }
    }
}
