package com.filghts.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.filghts.entity.Flight;

public interface FlightsRepository extends JpaRepository<Flight, Long> {
//	@Query
//	("from Flight where departureCity=:departureCity and arrivalCity=:arrivalCity and departureOfDate=:departureOfDate")
//			List<Flight> findFlights(@Param("departureCity") String from, @Param("arrivalCity") String to,
//			@Param("departureOfDate") Date departureOfDate);

	@Query
	("from Flight where departureCity=:departureCity and arrivalCity=:arrivalCity and dateOfDeparture=:dateOfDeparture")
			List<Flight> findFlights(@Param("departureCity") String from, @Param("arrivalCity") String to,
			@Param("dateOfDeparture") Date dateOfDeparture);
			}




 