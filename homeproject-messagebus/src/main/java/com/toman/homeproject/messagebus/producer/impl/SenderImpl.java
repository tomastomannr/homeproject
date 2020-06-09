package com.toman.homeproject.messagebus.producer.impl;

import com.toman.homeproject.messagebus.messaging.MultiOutputChannel;
import com.toman.homeproject.messagebus.model.BillBO;
import com.toman.homeproject.messagebus.producer.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@EnableBinding({MultiOutputChannel.class})
@Component
public class SenderImpl implements Sender {

    private final MultiOutputChannel channel;

    @Autowired
    public SenderImpl(final MultiOutputChannel channel) {
        this.channel = channel;
    }

    @Override
    public void send(BillBO bill) {
        try{
            channel.outputChannelOne().send(MessageBuilder.withPayload(bill).build());
        }catch(Exception ex){
            System.out.println("aaa");
        }
    }
}
