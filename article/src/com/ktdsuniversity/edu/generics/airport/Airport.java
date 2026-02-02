package com.ktdsuniversity.edu.generics.airport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Airport {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<AirPlane> airplanes = new ArrayList<>();
		
		List<Boolean> seats0002 = new ArrayList<>();
		seats0002.add(true);
		seats0002.add(true);
		seats0002.add(true);
		seats0002.add(true);
		seats0002.add(false);
		seats0002.add(true);
		seats0002.add(true);
		seats0002.add(true);
		seats0002.add(true);
		airplanes.add(new AirPlane("0002",seats0002));
		
		List<Boolean> seats0003 = new ArrayList<>();
		seats0003.add(false);
		seats0003.add(false);
		seats0003.add(false);
		seats0003.add(false);
		seats0003.add(false);
		seats0003.add(false);
		seats0003.add(false);
		seats0003.add(false);
		seats0003.add(false);
		airplanes.add(new AirPlane("0003",seats0003));
		
		while(true) {
			System.out.println("비행기편의 이름을 입력하면, 좌석 현황을 볼수있습니다.");
			System.out.println("비행기 편의 이름을 입력하세요 : ");
			String input = sc.nextLine();
			
			AirPlane selected = null;
			
			for(int i = 0; i<airplanes.size(); i++) {
				AirPlane plane = airplanes.get(i);
				if(plane.getFlight().equals(input)) {
					selected = plane;
					break;
				}
			
			}
			if(selected == null) {
				System.out.println(input+" 편은 존재하지 않습니다.");
				continue;
			}
			
			System.out.println("\n\""+selected.getFlight()+"\"편의 좌석 현황입니다.");
			printSeats(selected.getSeats());
			}
			
			
			
		}
		
		
		
		public static void printSeats(List<Boolean> seats) {
			for(int i = 0; i<seats.size(); i++) {
				System.out.println((i+1)+ " : ");
				if(seats.get(i)) {
					System.out.println("o");
				}
				else {
					System.out.println("x");
				}
			}
			System.out.println();
		
	}

}
