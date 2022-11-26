package com.example.carrent;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

@Service
public class CarService {

    private final CarStorage carStorage;
    private final RentalStorage rentalStorage;

    public CarService(CarStorage carStorage, RentalStorage rentalStorage) {
        this.carStorage = carStorage;
        this.rentalStorage = rentalStorage;
    }

    public RentalStorage getRentalStorage() {
        return rentalStorage;
    }

    public CarStorage getCarStorage() {
        return carStorage;
    }

    public List<Car> getAllCars() {
        return carStorage.getAvalableCarList();
    }

    public List<Rental> getAllRents() {
        return rentalStorage.getAllRents();
    }

    public void addCar(Car car) {
        carStorage.addCar(car);
    }

    public void addRent(Rental rental) {
        rentalStorage.addRent(rental);
    }

    public RentalInfo rentCar(User u, String carVin, LocalDate endDate) {
        if (u == null || endDate == null || carVin.isEmpty()) {
            throw new IllegalArgumentException("Wrong answer was provided !");
        }
        if (rentalStorage.isCarAvalable(carVin) && carStorage.isCarExistant(carVin)) {
            rentalStorage.addRent(new Rental(u, carStorage.getCarByVin(carVin)));
            return new RentalInfo(endDate, RentalStorage.carRentPrice(endDate, carStorage.getCarByVin(carVin)));
        }
        return null;
    }

}
