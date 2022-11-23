package com.example.carrent;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarStorage {
    private List<Car> avalableCarList = new ArrayList<>();

    public CarStorage() {
    }

    public List<Car> getAvalableCarList() {
        return avalableCarList;
    }

    public void setAvalableCarList(List<Car> avalableCarList) {
        this.avalableCarList = avalableCarList;
    }

    public void addCar(Car car) {
        avalableCarList.add(car);
    }

    public boolean isCarExistant(String carVin) {
        if (carVin.length() < 3) {
            throw new IllegalArgumentException("Provided argument is incorrect!");
        }
        for (Car car : avalableCarList) {
            if (car.getVin().equalsIgnoreCase(carVin)){
                return true;
            }
        }
        return false;
    }

    public Car getCarByVin(String carVin) {
        if (carVin.length() < 3 && isCarExistant(carVin)) {
            throw new IllegalArgumentException("Provided argument is incorrect!");
        }
        for (Car car : avalableCarList) {
            if (car.getVin().equalsIgnoreCase(carVin)) {
                return car;
            }
        }
        return null;
    }

}
