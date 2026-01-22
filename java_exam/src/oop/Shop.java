package oop;

public class Shop {
	
	Drinks [] shop;
	
	
	public Shop(Drinks b,Drinks m, Drinks h, Drinks s ) {
		this.shop = new Drinks[4];
		this.shop[0]= b;
		this.shop[1]= m;
		this.shop[2]= h;
		this.shop[3]= s;
	}
/**
 * 가게에서 음료를판매 
 * menu 0 박카스 1 몬스터 2 핫식스 3 밀키스 
 * 		
 */
	public void orderDrinks(int menu, int quantity) {
		if(menu<0 || menu>shop.length) {
			System.out.println("없는 물품입니다.");
			
		}
	
		
	}
	
	
	public void pritAllDrinksInfo() {
		for(int i; i<this.Drinks.length; i++) {
			System.out.println()
		}
	}
	
		
		
		
		
		
		
	}
	
