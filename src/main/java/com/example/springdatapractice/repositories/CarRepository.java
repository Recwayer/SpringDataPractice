package com.example.springdatapractice.repositories;

import com.example.springdatapractice.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarRepository extends JpaRepository<Car,Long> {
    @Override
    Optional<Car> findById(Long id);
}
