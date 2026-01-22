package oop;

public class CoffeShop {

	Coffe hot;
	Coffe ice;
	
	public CoffeShop(Coffe hot, Coffe ice) {
		this.hot = hot;
		this.ice = ice;
		
		
	}
	
	/**
	 * 커피숍에서 커피를 판매한다
	 * @param menu 메뉴들의 번호 1: hot 2:ice
	 * @param quantity 주문 수량
	 * @return 주문 가격
	 */
	
	
	public int orderCoffe(int menu, int quantity) {
		if(menu ==1) {
			System.out.println(this.hot.name + "음료를 " + quantity + "개 주문 받았습니다.");
			return hot.price + quantity;
		}
		else if(menu ==2) {
			System.out.println(this.ice.name + "음료를 " + quantity + "개 주문 받았습니다.");
			return ice.price + quantity;
		}
		else {
			System.out.println("존재하지 않는 음료 입니다.");
			return 0;
		}
		
	}
	
}
