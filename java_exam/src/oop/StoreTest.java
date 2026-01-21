package oop;

public class StoreTest {
	
	public static void main(String[]args) {
		
		Store ms = new Store();
		//System.out.println(ms);
		ms.pressPowerbutton();
		ms.increaseTemperature(4);
		ms.decreaseTemperature(0);
		
		int msTemperatur=ms.temperature;
		System.out.println("희망 온도 "+msTemperatur+"설정");
		
		//boolean acstatus =ms.isAcStart;
				//System.out.println("현재 에어컨은 "+acstatus);
		
		
		
		
		
		
		
		
	}
	

}
