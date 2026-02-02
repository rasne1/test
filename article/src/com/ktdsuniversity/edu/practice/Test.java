package com.ktdsuniversity.edu.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, List<Restaurant>> cityMap = new HashMap<>();
		List<Restaurant> seoulRestaurants = new ArrayList<>();
		
		List<String> gimbapMenus = new ArrayList<>();
		
		gimbapMenus.add("김밥");
		gimbapMenus.add("라면");
		gimbapMenus.add("돈까스");
		seoulRestaurants.add(new Restaurant("김밥천국",gimbapMenus));
		
		List<String> gukbapMenus = new ArrayList<>();
		
		gukbapMenus.add("돼지국밥");
		gukbapMenus.add("순대국밥");
		seoulRestaurants.add(new Restaurant("국밥집",gukbapMenus));
		
		cityMap.put("서울", seoulRestaurants);
		System.out.println("도시를 입력하세요");
		String city = sc.nextLine();
		
		List<Restaurant> restaurants = cityMap.get(city);
		if(restaurants == null) {
			System.out.println("해당 도시는 음식점이 없습니다.");
			return;
		}
		System.out.println("음식점 목록 : ");
		for(Restaurant r : restaurants) {
			System.out.println("- "+ r.getName());		
		}
		System.out.println("음식점 이름을 입력하세요");
		String restaurantName = sc.nextLine();
		
		Restaurant selected = null;
		
		for(Restaurant r : restaurants) {
			if(r.getName().equals(restaurantName)) {
				selected = r;
				break;
			}
		}
		if(selected == null) {
			System.out.println("해당 음식점은 존재하지 않습니다.");
			return;
		}
		
		System.out.println("메뉴 목록: ");
		for(String menu : selected.menus) {
			System.out.println("* "+menu);
		}
		
	}

}
