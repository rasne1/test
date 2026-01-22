package oop;

public class CoffeShopTest {
	
	public static void main(String[]args) {
		
		Coffe hotCoffe = new Coffe("아메리카노 (Hot)", 4500);
		Coffe iceCoffe = new Coffe("아이스티",4000);
		Coffe tea = new Coffe("케모마일 티", 5000);
		
		
		CoffeShopArray starbuck = new CoffeShopArray(hotCoffe, iceCoffe, tea);
		
		
		
		int price=starbuck.orderCoffe(1, 3);
		System.out.println(price);
		
		price=starbuck.orderCoffe(2, 6);
		System.out.println(price);
		
		price=starbuck.orderCoffe(3, 5);
		System.out.println(price);
		
		price=starbuck.orderCoffe(0, 10);
		System.out.println(price);
		
		
		
		
	}

}
