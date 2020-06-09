package com.toman.homeproject.messagebus.messaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface MultiInputChannel {

    String INPUT_CHANNEL_ONE ="inputChannelOne";

    @Input(INPUT_CHANNEL_ONE)
    MessageChannel inputChannelOne();
}
