package restaurant;

public class Restaurant {
	
	private int capital;
	public String name;
	int fullness;
	int drunkenness;
	
	public int getRestaurantCapital() {
		return this.capital;
	}
	public void setRestaurantCapital(int money) {
		this.capital = money;
	}
	
	public int cunsumerFullness(int fullness) {
		this.fullness = fullness;
		return this.fullness;
	}
	
	public int cunsumerDrunkenness(int drunkenness) {
		this.drunkenness = drunkenness;
		return this.drunkenness;
	}
	
	
	
}
