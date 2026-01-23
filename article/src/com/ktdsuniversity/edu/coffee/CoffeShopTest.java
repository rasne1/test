package com.ktdsuniversity.edu.coffee;

public class CoffeShopTest {
	
	public static void main(String[]args) {
		
		Coffe hotCoffe = new Coffe("아메리카노 (Hot)", 4500,100);
		Coffe iceCoffe = new Coffe("아이스티",4000,60);
		
		
		
		CoffeShop starbuck = new CoffeShop(hotCoffe, iceCoffe);
		
		
		
		int price=starbuck.orderCoffe(1, 89);
		System.out.println(price);
		
		price=starbuck.orderCoffe(2, 66);
		System.out.println(price);
		
		price=starbuck.orderCoffe(3, 5);
		System.out.println(price);
		
		price=starbuck.orderCoffe(0, 10);
		System.out.println(price);
		
		
		
		
	}

}
