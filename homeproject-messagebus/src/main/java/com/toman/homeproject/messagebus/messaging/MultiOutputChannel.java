package com.toman.homeproject.messagebus.messaging;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MultiOutputChannel {

    String OUTPUT_CHANNEL_ONE ="outputChannelOne";

    @Output(OUTPUT_CHANNEL_ONE)
    MessageChannel outputChannelOne();
}
