package com.example.reservationrestapi.repository;

import com.example.reservationrestapi.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}
