 package com.filghts.controller;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.filghts.entity.Flight;
import com.filghts.repository.FlightsRepository;

@Controller
public class FlightController {

	 @Autowired
	 private FlightsRepository flightsRepo;
	 
	 
	 //localhost:8080/findFlights
	@RequestMapping("/findFlights")
	public String findFlights(
	@RequestParam("from") String from,
	@RequestParam("to") String to,
	@RequestParam("dateOfDeparture")@DateTimeFormat(pattern ="MM-dd-yyyy") Date dateOfDeparture,
	ModelMap model) 
	{
		List<Flight> findFlights = flightsRepo.findFlights(from, to ,dateOfDeparture);
		 System.out.println(findFlights(from, to, dateOfDeparture, model));
		     return"dislayFlights";
	}
	
	}
	
	

