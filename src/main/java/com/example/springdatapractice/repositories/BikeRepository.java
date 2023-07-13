package com.example.springdatapractice.repositories;

import com.example.springdatapractice.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BikeRepository extends JpaRepository<Bike, Long> {
    Optional<Bike> findById(Long id);
}
