package oop;

public class Store {
	
	
	
	boolean isAcStart;
	
	int temperature = 0;
	int currentTemperature =16;
	
	public void pressPowerbutton() {
		if(isAcStart) {
			System.out.println("에어컨이 꺼져있습니다.");
			
			isAcStart=false;
			temperature = 0;
			
		}
		else {
			
			isAcStart=true;
			temperature=24;
			currentTemperature=16;
			System.out.println("에어컨이 켜집니다.");
			System.out.println("기본설정 온도 "+ temperature +" 로 설정");
			System.out.println("현재 온도 "+ currentTemperature +" 입니다.");
		} 	
		
		
	}
	
	public void increaseTemperature (int up) {
		if(isAcStart) {
			temperature += up;
			System.out.println("희망 온도"+up+"만큼 상승");
		}
		
	}
	public void decreaseTemperature (int down) {
		if(isAcStart) {
			temperature -= down;
			System.out.println("희망 온도"+down+"만큼 감소");
		}
	}

	
	
	

}
