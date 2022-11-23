package com.example.carrent;

public class Car {

    private final String make;
    private final String model;
    private final String vin;
    private final CarType carType;

    public Car(String make, String model, String vin, CarType carType) {
        this.make = make;
        this.model = model;
        this.vin = vin;
        this.carType = carType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getVin() {
        return vin;
    }

    public CarType getCarType() {
        return carType;
    }

    @Override
    public String toString() {
        return make + " " + model + " " + vin;
    }
}
