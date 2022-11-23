package com.example.carrent;

import org.springframework.stereotype.Service;

import java.util.List;

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

    public Rental rentCar(User u, String carVin) {
        if (u == null) {
            throw new IllegalArgumentException("No user was provided !");
        }
        if (rentalStorage.isCarAvalable(carVin) && carStorage.isCarExistant(carVin)) {
            return new Rental(u, carStorage.getCarByVin(carVin));
        }
        return null;
    }

}
