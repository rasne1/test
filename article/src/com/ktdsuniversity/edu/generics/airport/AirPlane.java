package com.ktdsuniversity.edu.generics.airport;

public class AirPlane {
	
	private String name;
	private String destination;

	public AirPlane(String name, String destination) {
		this.name = name;
		this.destination = destination;
	}

	
	@Override
	public String toString() {
		return "AirPlane [name = " + this.name + ", destination="+this.destination+"]";
	}
}
