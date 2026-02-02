package com.ktdsuniversity.edu.practice;
import java.util.List;

public class AirPlane {
	
	    private String flight;
	    private List<Boolean> seats; // true = O, false = X

	    public AirPlane(String flight, List<Boolean> seats) {
	        this.flight = flight;
	        this.seats = seats;
	    }

	    public String getFlight() {
	        return flight;
	    }

	    public List<Boolean> getSeats() {
	        return seats;
	    }

	    @Override
	    public String toString() {
	        return flight;
	    }
	}



