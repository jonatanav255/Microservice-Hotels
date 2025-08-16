package com.example.demo.hotel;

import org.springframework.data.jpa.repository.JpaRepository;


public interface HotelRepository extends JpaRepository<Hotel, Long> {
    // nothing else needed for now
}
