package com.learning.builder;

public class Car {
    private String carType;
    private String carDoor;
    private String price;

    private Car(String carType, String carDoor, String price) {
        this.carType = carType;
        this.carDoor = carDoor;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType='" + carType + '\'' +
                ", carDoor='" + carDoor + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public static class CarBuilder {
        private String carType;
        private String carDoor;
        private String price;

        public CarBuilder setCarType(String carType) {
            this.carType = carType;
            return this;
        }

        public CarBuilder setCarDoor(String carDoor) {
            this.carDoor = carDoor;
            return this;
        }

        public CarBuilder setPrice(String price) {
            this.price = price;
            return this;
        }

        public Car build() {
            return new Car(carType, carDoor, price);
        }
    }
}
