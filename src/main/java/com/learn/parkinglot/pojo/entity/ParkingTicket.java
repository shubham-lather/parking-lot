package com.learn.parkinglot.pojo.entity;

import com.learn.parkinglot.pojo.TicketStatus;

import java.time.LocalDateTime;

public class ParkingTicket {
    private String ticketId;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private TicketStatus ticketStatus;
    private ParkingSpot parkingSpot; //TODO: circular dependency?
    private Vehicle vehicle; //TODO: circular dependency?
}
