package com.learn.parkinglot.pojo.entity;

import com.learn.parkinglot.pojo.Category;
import com.learn.parkinglot.pojo.SpotType;

public class ParkingSpot {

    private String spotId;

    private Category spotCategory;

    private SpotType spotType;

    private Boolean isAvailable;

    private ParkingTicket parkingTicket; //TODO: circular dependency?

}
