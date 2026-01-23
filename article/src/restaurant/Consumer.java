package restaurant;

public class Consumer {
	private String name;
	private int wallet;
	private int maxFullness;
	private int maxDrunkenness;
	private int fullness;
	private int drunkenness;
	
	
	public Consumer(String name,int wallet, int maxFullness, int maxDrunkenness) {
		this.name = name;
		this.wallet = wallet;
		this.maxFullness = maxFullness ;
		this.maxDrunkenness = maxDrunkenness;
		
	}

	
	
	public int getMaxFullness() {
		return this.maxFullness;
	}
	public int getMaxDrunkenness() {
		return this.maxDrunkenness;
	}
	
	public int getCunsumerFullness() {
		return this.fullness;
	}
	public void setCunsumerFullness(int fullness) {
		this.fullness = fullness;
	}
	
	public int getCunsumerDrunkenness() {
		return this.drunkenness;
	}
	public void setCunsumerDrunkenness(int drunkenness) {
		this.drunkenness = drunkenness;
		
	}

	
	
	public boolean isEnoughMoney(int money) {
		return this.wallet >= money;
	}
	

}
