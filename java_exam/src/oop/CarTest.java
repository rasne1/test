package oop;

public class CarTest {
	
	public static void main(String [] args) {
		
		Car kona = new Car();
		System.out.println(kona);
		kona.pressEngineStartButton();
		kona.pressBrakePedal(0);
		
		
		//kona의 엔진상태를 출력한다
		//kona의 현재 속도를 출력한다.
		boolean konaEngineState=kona.isEngineStart;
		System.out.println("kona engine "+konaEngineState);
		int konaSpeed =kona.speed;
		System.out.println("kona speed "+ konaSpeed);
		
		/*Car canival = new Car();
		System.out.println(canival);
		
		canival.pressGasolinPedal(200);
		canival.pressEngineStartButton();
		canival.pressBrakePedal(10);
		canival.pressBrakePedal(10);
		
		
		boolean canivalisEngineState=canival.isEngineStart;
		int canivalSpeed = canival.speed;
		System.out.println("canival: engine "+canivalisEngineState);
		System.out.println("canival: speed "+ canivalSpeed);*/
	}

}
