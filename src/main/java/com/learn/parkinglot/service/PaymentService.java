package com.learn.parkinglot.service;

import com.learn.parkinglot.pojo.entity.ParkingTicket;
import sun.security.krb5.internal.Ticket;

public interface PaymentService {

    long calculateFee(ParkingTicket parkingTicket);

    void processParkingFee(ParkingTicket parkingTicket);
}
