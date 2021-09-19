package com.learn.parkinglot.pojo.entity;

import com.learn.parkinglot.pojo.Category;
import com.learn.parkinglot.pojo.VehicleType;

public class Vehicle {

    private String vehicleNumber;

    private Category vehicleCategory;

    private VehicleType vehicleType;

    private ParkingTicket parkingTicket; //TODO: circular dependency?
}
