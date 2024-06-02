package com.learning.builder;

public class main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .setCarType("SUV")
                .setCarDoor("4")
                .setPrice("30000")
                .build();

        System.out.println(car);
    }
}
