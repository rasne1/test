package restaurant;

public class Menu {
	private final String name;
	private final int price;
	private int alcoholIncrease;
	private int FullnessIncrease;
	
	public Menu(String name,int price, int FullnessIncrease, int alcoholIncrease) {
		this.name = name;
		this.price = price;
		this.alcoholIncrease = alcoholIncrease;
		this.FullnessIncrease = FullnessIncrease;
		
	}
	
	public String getName() { // 음식 이름
		return name;
	}
	public int getPrice() { //음식의 가격
		return price;
	}

	public int getAlcoholIncrease() { // 취함 증가량
		return alcoholIncrease;
	}
	public int getFullnessIncrease() { // 배부름 증가량
		return FullnessIncrease;
	}
}
