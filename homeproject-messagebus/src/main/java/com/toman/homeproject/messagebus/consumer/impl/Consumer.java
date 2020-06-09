package com.toman.homeproject.messagebus.consumer.impl;

import com.toman.homeproject.messagebus.messaging.MultiInputChannel;
import com.toman.homeproject.messagebus.messaging.MultiOutputChannel;
import com.toman.homeproject.messagebus.model.BillBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@EnableBinding({MultiInputChannel.class})
public class Consumer {

    private final MultiInputChannel channel;

    @Autowired
    public Consumer(final MultiInputChannel channel) {
        this.channel = channel;
    }

    @StreamListener(MultiInputChannel.INPUT_CHANNEL_ONE)
    public void receive(BillBO billBO){
        System.out.println(billBO);
    }
}
