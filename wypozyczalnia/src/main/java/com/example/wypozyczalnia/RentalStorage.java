package com.example.wypozyczalnia;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RentalStorage {
    private List<Rental> rentalList = new ArrayList<>();

    public RentalStorage(List<Rental> rentalList) {
        this.rentalList = rentalList;
    }

    public List<Rental> getAllRents(){
        return rentalList;
    }

    public void addRent(Rental rental){
        rentalList.add(rental);
    }
}
