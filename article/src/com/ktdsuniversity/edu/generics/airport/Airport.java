package com.ktdsuniversity.edu.generics.airport;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ktdsuniversity.edu.generics.collections.reservation.Seat;

public class Airport {

	private Map<String, List<Seat>> airplanePlan;
	
	public Airport() {
		airplanePlan = new HashMap<>();
	}
	
	public void addPlan(String airplaneName, List<Seat> seats) {
		this.airplanePlan.put(airplaneName, seats);
	}
	
	public boolean havePlaneName(String airplaneName) {
		List<Seat> seats = this.airplanePlan.get(airplaneName);
		if (seats == null) {
			return false;
		}
		return true;
	}
	
	public void printPlanes() {
		int remainSeatCount = 0;
		// airplanePlan = {"0002"=List<Seat>, "0003"=List<Seat>}
		// airplanePlan.keySet() ==> Set<String> = ["0002", "0003"]
		// mac : Option + Shift + R
		// windows: Alt + Shift + R
		for (String key: this.airplanePlan.keySet()) {
			remainSeatCount = 0;
			for ( Seat seat: this.airplanePlan.get(key) ) {
				if (! seat.getIsReserved() ) {
					remainSeatCount++;
				}
			}
			System.out.println("\"" + key + "편\" 예매가능 좌석 수: " + remainSeatCount);
		}
	}
	
	public void printSeats(String airplaneName) {
		List<Seat> seats = this.airplanePlan.get(airplaneName);
		System.out.println("\"" + airplaneName + "\"편의 좌석 현황입니다. (O: 예약 가능, X: 예약 불가능)");
		for (Seat seat : seats) {
			System.out.print(seat);
		}
		System.out.println();
	}
	
	public boolean haveRemainSeat(String airplaneName) {
		List<Seat> seats = this.airplanePlan.get(airplaneName);
		for (Seat seat: seats) {
			if (!seat.getIsReserved()) {
				return true;
			}
		}
		return false;
	}
	
	public boolean canReserveSeat(String airplaneName, int seatNum) {
		List<Seat> seats = this.airplanePlan.get(airplaneName);
		for (Seat seat: seats) {
			if (seat.getNum() == seatNum && seat.getIsReserved()) {
				return false;
			}
		}
		return true;
	}
	
	public void reserveSeat(String airplaneName, int seatNum) {
		List<Seat> seats = this.airplanePlan.get(airplaneName);
		for (Seat seat: seats) {
			if (seat.getNum() == seatNum) {
				seat.setIsReserved(true);
				return;
			}
		}
	}
	
}
