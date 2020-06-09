package com.toman.homeproject.messagebus;

import com.toman.homeproject.messagebus.model.BillBO;

public interface MessagebusService {

    void send(BillBO bill);
}
