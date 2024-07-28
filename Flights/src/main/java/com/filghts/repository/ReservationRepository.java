package com.filghts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filghts.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
