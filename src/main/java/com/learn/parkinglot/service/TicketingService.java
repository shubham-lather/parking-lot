package com.learn.parkinglot.service;

import com.learn.parkinglot.pojo.entity.ParkingTicket;

public interface TicketingService {

    ParkingTicket generateTicket();

    void processTicket(ParkingTicket parkingTicket);

}
