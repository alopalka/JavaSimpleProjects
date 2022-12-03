package com.example.carrent;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Component
public class RentalStorage {
    private List<Rental> rentalList = new ArrayList<>();

    public RentalStorage(List<Rental> rentalList) {
        this.rentalList = rentalList;
    }

    public List<Rental> getAllRents() {
        return rentalList;
    }

    public boolean isCarAvalable(String carVin) {
        for (Rental rental : rentalList) {
            if (rental.getCar().getVin().equalsIgnoreCase(carVin)){
                return false;
            }
        }
        return true;
    }

    public void addRent(Rental rental) {
        rentalList.add(rental);
    }

    public static double carRentPrice(LocalDate endDate, Car car) {
        return ChronoUnit.DAYS.between(LocalDate.now(), endDate) * car.getCarType().getStake();
    }
}
