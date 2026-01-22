package oop;

public class Shoptest {
	
	public static void main(String[]args) {
		
		Drinks b = new Drinks("박카스", 900,15);
		Drinks m = new Drinks("몬스터", 1500,20);
		Drinks h = new Drinks("핫식스", 1300,10);
		Drinks s = new Drinks("밀키스", 1400,5);
		
		
		Shop machine = new Shop(b,m,h,s);
		
		
		
		int price=machine.(1, 3);
		System.out.println(price);
		
		price=machine.orderCoffe(2, 6);
		System.out.println(price);
		
		price=machine.orderCoffe(3, 5);
		System.out.println(price);
		
		price=machine.orderCoffe(0, 10);
		System.out.println(price);
		
		
		
		
	}

}
