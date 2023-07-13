package com.example.springdatapractice.repositories;

import com.example.springdatapractice.models.Plane;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlaneRepository extends JpaRepository<Plane,Long> {
    Optional<Plane> findById(Long id);
}
