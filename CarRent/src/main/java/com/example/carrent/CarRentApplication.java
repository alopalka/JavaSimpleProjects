package com.example.carrent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class CarRentApplication {

    private final CarService carService1;

    public CarRentApplication(CarService carService) {
        this.carService1 = carService;
        User user1 = new User(2137232);
        Car car1 = new Car("Volksvagen", "golf 4", "2137", CarType.GRUZ);

        carService1.addCar(car1);

        System.out.println(carService1.getAllCars());
        System.out.println(carService1.getAllRents());

        System.out.println(carService1.rentCar(user1, "2137", LocalDate.of(2023, 12, 12)));

    }

    public static void main(String[] args) {
        SpringApplication.run(CarRentApplication.class, args);
    }


}
