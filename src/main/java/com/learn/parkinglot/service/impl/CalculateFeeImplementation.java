package com.learn.parkinglot.service.impl;

import com.learn.parkinglot.service.CalculateFee;
import org.springframework.stereotype.Service;
import sun.security.krb5.internal.Ticket;

@Service
public class CalculateFeeImplementation implements CalculateFee {

    @Override
    public long calculateFee(Ticket ticket) {
        return 0;
    }
}
