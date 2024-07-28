package com.filghts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filghts.entity.Passenger;

public interface PassengerRepositoy extends JpaRepository<Passenger, Long> {

}
