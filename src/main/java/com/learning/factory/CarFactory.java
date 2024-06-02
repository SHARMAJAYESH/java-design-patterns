package com.learning.factory;

public class CarFactory {

    public Car createCar(String type) {
        if (type == null || type.isEmpty())
            return null;
        return switch (type) {
            case "Sedan" -> new Sedan();
            case "SUV" -> new SUV();
            case "Truck" -> new Truck();
            default -> throw new IllegalArgumentException("Unknown car Type: " + type);
        };
    }
}
