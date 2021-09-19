package com.learn.parkinglot.pojo;

public class ParkingLotSpotCountDetails {

    private int compactSpotCount;
    private int largeSpotCount;
    private int handicappedSpotCount;
    private int motorbikeSpotCount;

    private final int maxCompactSpotCount;
    private final int maxLargeSpotCount;
    private final int maxHandicappedSpotCount;
    private final int maxMotorbikeSpotCount;

    public ParkingLotSpotCountDetails(int maxCompactSpotCount, int maxLargeSpotCount, int maxHandicappedSpotCount, int maxMotorbikeSpotCount) {
        this.maxCompactSpotCount = maxCompactSpotCount;
        this.maxLargeSpotCount = maxLargeSpotCount;
        this.maxHandicappedSpotCount = maxHandicappedSpotCount;
        this.maxMotorbikeSpotCount = maxMotorbikeSpotCount;
    }
}
