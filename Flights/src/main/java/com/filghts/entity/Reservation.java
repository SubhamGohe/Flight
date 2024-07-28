package com.filghts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Reservation extends AbstractEntity {
         
	private boolean checkeId;
	private int numberOfBags;
	@OneToOne
	private Passenger passenger;
	@OneToOne
	private Flight flight;
	
	
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reservation(boolean checkeId, int numberOfBags, Passenger passenger, Flight flight) {
		super();
		this.checkeId = checkeId;
		this.numberOfBags = numberOfBags;
		this.passenger = passenger;
		this.flight = flight;
	}
	@Override
	public String toString() {
		return "Reservation [checkeId=" + checkeId + ", numberOfBags=" + numberOfBags + ", passenger=" + passenger
				+ ", flight=" + flight + "]";
	}
	public boolean isCheckeId() {
		return checkeId;
	}
	public void setCheckeId(boolean checkeId) {
		this.checkeId = checkeId;
	}
	public int getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
    
	
	
	
}
