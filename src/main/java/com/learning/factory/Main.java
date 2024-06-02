package com.learning.factory;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Car sedan = carFactory.createCar("Sedan");
        sedan.drive();

        Car suv = carFactory.createCar("SUV");
        suv.drive();

        Car truck = carFactory.createCar("Truck");
        truck.drive();
    }
}
