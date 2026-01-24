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
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}

	public int getAlcoholIncrease() {
		return alcoholIncrease;
	}
	public int getFullnessIncrease() {
		return FullnessIncrease;
	}
}
