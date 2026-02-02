package com.ktdsuniversity.edu.generics.airport;

import java.util.List;

public class AirPlane {
	
	private String flight;
	private List<Boolean>seats;

	public AirPlane(String flight,List<Boolean>seats) {
		this.flight = flight;
		this.seats = seats;
		
	}

	public String getFlight() {
		return this.flight;
	}
	
	public List<Boolean> getSeats(){
		return seats;
	}
	
	@Override
	public String toString() {
		
		return flight;
	}
	
}
