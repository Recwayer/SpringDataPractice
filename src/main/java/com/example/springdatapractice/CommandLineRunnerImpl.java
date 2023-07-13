package com.example.springdatapractice;

import com.example.springdatapractice.models.Bike;
import com.example.springdatapractice.models.Car;
import com.example.springdatapractice.models.Plane;
import com.example.springdatapractice.repositories.BikeRepository;
import com.example.springdatapractice.repositories.CarRepository;
import com.example.springdatapractice.repositories.PlaneRepository;
import com.example.springdatapractice.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.math.BigDecimal;
@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private BikeRepository bikeRepository;
    @Autowired
    private VehicleRepository vehicleRepository;
    @Autowired
    private PlaneRepository planeRepository;

    @Override
    public void run(String... args) throws Exception {
        seedData();

        printAllCar();
        printAllVehicle();
    }

    private void printAllCar() {
        carRepository
                .findAll()
                .forEach(System.out::println);
    }

    private void printAllVehicle() {
        vehicleRepository
                .findAll()
                .forEach(System.out::println);
    }

    private void seedData() throws IOException {
        Car c1 = new Car("Car", "BMW", BigDecimal.valueOf(6513.5), "92", 5);
        Car c2 = new Car("Car", "Mazda", BigDecimal.valueOf(654.2), "95", 7);
        Plane p1 = new Plane("Plane", "AirPlane", BigDecimal.valueOf(512.6), "92", 60);
        Bike b = new Bike("Bike", "BMW", BigDecimal.valueOf(31.4), "92");
        carRepository.save(c1);
        carRepository.save(c2);
        planeRepository.save(p1);
        bikeRepository.save(b);
        c1.setPrice(BigDecimal.valueOf(667.1));
        b.setPrice(BigDecimal.valueOf(478.2));
        b.setFuelType("95");
        carRepository.save(c1);
        bikeRepository.save(b);
        System.out.println(carRepository.findById(c1.getId()).get());
        System.out.println(bikeRepository.findById(b.getId()).get());
    }
}
