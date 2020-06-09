package com.toman.homeproject.messagebus.producer;

import com.toman.homeproject.messagebus.model.BillBO;

public interface Sender {

    void send(BillBO bill);
}
