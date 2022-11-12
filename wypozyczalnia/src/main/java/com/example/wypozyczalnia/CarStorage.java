package com.example.wypozyczalnia;

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

    public void addCar(Car car){
        avalableCarList.add(car);
    }

}
