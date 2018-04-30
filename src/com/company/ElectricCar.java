package com.company;

public class ElectricCar implements ElectricVehicle {

    @Override
    public void speed() {
        System.out.println("Speed up the car....");
    }

    @Override
    public void chargeBattery() {
        System.out.println("charging the Battery...");
    }
}
