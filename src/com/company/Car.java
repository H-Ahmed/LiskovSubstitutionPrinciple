package com.company;

public class Car implements Vehicle {

    @Override
    public void speed() {
        System.out.println("Speed up the car....");
    }

    @Override
    public void addFuel() {
        System.out.println("Adding fuel to car....");
    }
}
