package com.ktdsuniversity.edu.practice;

import java.util.List;

public class Restaurant { //데이터클래스
	
	private String name;
	List<String> menus; // 배열 x   List o


	public Restaurant(String name, List<String> menus) {
		this.name = name;
		this.menus = menus;
	}
	
	public String getName() {
		return this.name;
	}

}
