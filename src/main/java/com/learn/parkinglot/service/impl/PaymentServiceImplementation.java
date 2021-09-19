package com.learn.parkinglot.service.impl;

import com.learn.parkinglot.pojo.entity.ParkingTicket;
import com.learn.parkinglot.service.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImplementation implements PaymentService {

    @Override
    public long calculateFee(ParkingTicket parkingTicket) {
        return 0;
    }

    @Override
    public void processParkingFee(ParkingTicket parkingTicket) {

    }
}
