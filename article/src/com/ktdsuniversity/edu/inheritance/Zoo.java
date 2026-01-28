package com.ktdsuniversity.edu.inheritance;

public class Zoo {
	
	public static void main(String [] args) {
		
		String name = "라라";
		String other = "라라";
		System.out.println(name==other);
		
		
		Animal duck = new Bird("오리","꽥",15f,20f,50f);
		Animal duck2 = new Bird("오리","꽥",15f,20f,50f);
		
		System.out.println("==비교 : "+ (duck == duck2));
		System.out.println("equals 비교 : "+duck.equals(duck2));
		duck.howling();
		duck.move();
		// 구버전 
		//if(duck instanceof Bird) {
		//	Bird bird = (Bird) duck;
		//	bird.fly();
		//	bird.land();
			
		//}
		// 현재 버전
		if( duck instanceof Bird bird) {
			bird.fly();
			bird.move();
			
			bird.land();
			bird.move();
			bird.fly();
		}
		
		//duck.fly(); instanceof 써서 명시적 형변환을 해야함 
		//duck.land();
		
		System.out.println(duck);
		
		
		Animal lion = new Animal("사자","크아앙",80f,60f,200f);
		
		Animal tiger = new Animal("호랑이","어흥",50f,55f,200f);
		
	
		tiger.attack(duck);
		lion.howling();
		tiger.howling();
		
		lion.move();
		tiger.move();
		
		
		duck.attack(tiger);
		lion.attack(tiger);
		tiger.attack(lion);
		
		
	}

}
