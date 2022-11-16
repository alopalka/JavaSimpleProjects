package com.example.carrent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarRentApplication {

    private final CarService carService1;

    public CarRentApplication(CarService carService) {
        this.carService1 = carService;
        User user1 = new User(2137);
        Car car1 = new Car("Volksvagen", "golf 4", "2137", CarType.GRUZ);
        Rental rental1 = new Rental(user1, car1);

        carService1.addCar(car1);
        carService.addRent(rental1);

        System.out.println(carService1.getAllCars());
        System.out.println(carService1.getAllRents());
    }

    public static void main(String[] args) {
        SpringApplication.run(CarRentApplication.class, args);
    }


}
