package com.learning.factory;

public class Truck implements Car {

    @Override
    public void drive() {
        System.out.println("Driving a Truck...");
    }
}
