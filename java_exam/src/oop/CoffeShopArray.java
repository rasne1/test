package oop;

public class CoffeShopArray {
	
	Coffe[] drinks;
	
	
	public CoffeShopArray(Coffe hot, Coffe ice,Coffe tea) {
		this.drinks = new Coffe[3];
		this.drinks[0]=hot;
		this.drinks[1]=ice;
		this.drinks[2]=tea;
	}
	
	/**
	 * 커피숍에서 커피를 판매한다
	 * @param menu 메뉴들의 번호 0: hot 1:ice 2: tea
	 * @param quantity 주문 수량
	 * @return 주문 가격
	 */
	
	
	public int orderCoffe(int menu, int quantity) {
		if(menu < 0 || menu >= this.drinks.length) {
			System.out.println("존재하지 않는 메뉴입니다.");
			return 0;
		}
		
		Coffe drink = this.drinks[menu];
		System.out.println(drink.name+"음료를 "+quantity + "개 주문하였습니다.");
		return drink.price*quantity;
		
	}
	
}
