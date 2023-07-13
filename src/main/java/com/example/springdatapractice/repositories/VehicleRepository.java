package com.example.springdatapractice.repositories;

import com.example.springdatapractice.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle,Long> {
}
