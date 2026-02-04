package com.ktdsuniversity.edu.generics.airport;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ktdsuniversity.edu.generics.collections.reservation.Seat;

public class AirportTest {

	private Scanner keyboard;
	private Airport port;
	
	public AirportTest() {
		this.keyboard = new Scanner(System.in);
		
		List<Seat> seat0002 = new ArrayList<>();
		seat0002.add(new Seat(1, false));
		seat0002.add(new Seat(2, false));
		seat0002.add(new Seat(3, false));
		seat0002.add(new Seat(4, false));
		seat0002.add(new Seat(5, true));
		seat0002.add(new Seat(6, false));
		seat0002.add(new Seat(7, false));
		seat0002.add(new Seat(8, false));
		seat0002.add(new Seat(9, false));
		
		List<Seat> seat0003 = new ArrayList<>();
		seat0003.add(new Seat(1, true));
		seat0003.add(new Seat(2, true));
		seat0003.add(new Seat(3, true));
		seat0003.add(new Seat(4, true));
		seat0003.add(new Seat(5, true));
		seat0003.add(new Seat(6, true));
		seat0003.add(new Seat(7, true));
		seat0003.add(new Seat(8, true));
		seat0003.add(new Seat(9, true));
		
		this.port = new Airport();
		this.port.addPlan("0002", seat0002);
		this.port.addPlan("0003", seat0003);
	}

	public void run() {
		String planeName = null;
		
		while (true) {
			System.out.println("비행기 편의 이름을 입력하면, 좌석 현황을 볼 수 있습니다.");
			System.out.print("비행기 편의 이름을 입력하세요: ");
			planeName = this.writePlaneName();
			
			if(this.port.havePlaneName(planeName)) {
				this.port.printSeats(planeName);
				
				if (this.port.haveRemainSeat(planeName)) {
					this.reserveSeat(planeName);
				}
				else {
					System.out.println("예약 가능한 좌석이 없습니다. 다른 비행기 편을 이용해 주세요.");
				}
			}
			else {
				System.out.println("\"" + planeName + "\"편은 존재하지 않습니다.");
			}
		}
	}
	
	public String writePlaneName() {
		return this.keyboard.nextLine();
	}
	
	public void reserveSeat(String planeName) {
		int seatNum = 0;
		String yesOrNo = null;
		
		while (true) {
			seatNum = this.inputSeatNum(planeName);
			
			System.out.print("\"" + seatNum + "\"번 좌석을 예약하시겠습니까? (y/N): ");
			yesOrNo = this.keyboard.nextLine();
			if (yesOrNo.equalsIgnoreCase("Y")) {
				this.port.reserveSeat(planeName, seatNum);
				break;
			}
		}
		this.port.printSeats(planeName);
	}
	
	public int inputSeatNum(String planName) {
		int seatNum = 0;
		System.out.print("좌석 예약을 하려면 번호를 입력하세요:");
		while (true) {
			seatNum = this.keyboard.nextInt();
			this.keyboard.nextLine();
			if (this.port.canReserveSeat(planName, seatNum)) {
				break;
			}
			else {
				System.out.println("\"" + seatNum + "\"번 좌석은 이미 예약된 좌석입니다. 다른 좌석을 입력하세요:");
			}
		}
		return seatNum;
	}
	
	public static void main(String[] args) {
		AirportTest port = new AirportTest();
		port.run();
	}
	
}
