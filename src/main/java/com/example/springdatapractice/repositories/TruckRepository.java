package com.example.springdatapractice.repositories;

import com.example.springdatapractice.models.Truck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TruckRepository extends JpaRepository<Truck,Long> {
}
