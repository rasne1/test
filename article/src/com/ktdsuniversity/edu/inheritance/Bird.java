package com.ktdsuniversity.edu.inheritance;

public class Bird extends Animal{
	
	
	private boolean isFly;
	private float walkingspeed;
	
	public Bird(String name, String voice,float speed,float damage,float hitpoint) {
		super(name,voice,speed,damage,hitpoint);
		this.walkingspeed = speed;
	}
	
	public boolean getIsFly() {
		return this.isFly;
	}
	
	public void fly() {
		this.isFly=true;
		//.speed = 70;
		super.setSpeed(70f);
		
	}
	
	public void land() {
		this.isFly = false;
		super.setSpeed(this.walkingspeed);
	}
	
	// bird 클래스의 최종 super class 인 object 클래스의 toString() 메소드를 다시 정의한다 .
	@Override
	public String toString() {
		String str = "Bird [name:%s,isFly: %s]";
		return str.formatted(super.getName(),this.isFly);
	}
	

}
