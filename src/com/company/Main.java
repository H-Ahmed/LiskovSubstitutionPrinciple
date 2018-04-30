package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vehicle car = new ElectricCar();

        if (car instanceof ElectricCar) {
            System.out.println("Unable to add fuel to electric car");
        }else {
            car.addFuel();
        }
    }
}
