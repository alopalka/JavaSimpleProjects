package com.example.carrent;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Rental {

    private final User user;
    private final Car car;

    private List<Rental> rentalList = new ArrayList<>();

    public Rental(User user, Car car) {
        this.user = user;
        this.car = car;
        rentalList.add(this);
    }

    public User getUser() {
        return user;
    }

    public Car getCar() {
        return car;
    }

    public static double carRentPrice(LocalDate endDate, Car car) {
        return ChronoUnit.DAYS.between(LocalDate.now(), endDate) * car.getCarType().getStake();
    }

    @Override
    public String toString() {
        return "Rental: " + user + " " + car;
    }
}
