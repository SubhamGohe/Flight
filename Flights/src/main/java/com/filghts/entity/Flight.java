package com.filghts.entity;

import java.sql.Timestamp;
import java.util.Date;

import jakarta.persistence.Entity;

@Entity 
public class Flight extends AbstractEntity{
  
	
	private String flightNumber;
	private String operatingAirline;
	private String departureCity;
	private String  arrivalCity;
	private Date dateOfDeparture; //date_of_departure
	private Timestamp estimatedDepartureTime;
	
	
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flight(String flightNumber, String operatingAirline, String departureCity, String arrivalCity,
			Date dateOfDeparture, Timestamp estimatedDepartureTime) {
		super();
		this.flightNumber = flightNumber;
		this.operatingAirline = operatingAirline;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.dateOfDeparture = dateOfDeparture;
		this.estimatedDepartureTime = estimatedDepartureTime;
	}
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", operatingAirline=" + operatingAirline + ", departureCity="
				+ departureCity + ", arrivalCity=" + arrivalCity + ", dateDaparture=" + dateOfDeparture
				+ ", estimatedDepartureTime=" + estimatedDepartureTime + "]";
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getOperatingAirline() {
		return operatingAirline;
	}
	public void setOperatingAirline(String operatingAirline) {
		this.operatingAirline = operatingAirline;
	}
	public String getDepartureCity() {
		return departureCity;
	}
	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}
	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}
	public Timestamp getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}
	public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}
	
	
}
