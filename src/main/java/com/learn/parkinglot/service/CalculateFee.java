package com.learn.parkinglot.service;

import sun.security.krb5.internal.Ticket;

public interface CalculateFee {

    long calculateFee(Ticket ticket);
}
