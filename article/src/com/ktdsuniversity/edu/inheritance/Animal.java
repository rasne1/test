package com.ktdsuniversity.edu.inheritance;

public class Animal {
	
	
	private String name;
	private String voice;
	private float speed;
	private float damage;
	private float hitpoint;

	
	//public Animal() {
		
	//}
	
	
	public Animal(String name, String voice,float speed,float damage,float hitpoint) {
		this.name = name;
		this.voice = voice;
		this.speed = speed;
		this.damage = damage;
		this.hitpoint = hitpoint;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	
	
	public void howling() {
		System.out.println(this.name+" : "+this.voice);
	}
	
	public void move() {
		System.out.println(this.name+" : "+this.speed+ " km/h 의 속도로 움직임.");
	}
	
	public void attack(Animal other) {
		if(this.isDead()) {
			System.out.println(this.name+ " 이 이미 죽어서 행동 할 수 없습니다.");
			return;
		}
		if(!(this instanceof Bird) && other instanceof Bird bird) {
			
			//bird 가 날고있으면 공격 불가
			if(bird.getIsFly()) {
				System.out.println(other.getName()+ " 이 비행중이라 공격할수없습니다.");
				return;
			}
			
			
		}
		
		System.out.println(this.name+" 이 "+other.getName()+" 에게 공격하려 합니다.");
		if(!other.isDead()) {
			other.getDamage(this.damage);
		}
		
		else {
			System.out.println(other.getName() + " 이 이미 죽었습니다.");
		}
		
		other.getDamage(this.damage);
	}
	
	
	public void getDamage(float damage) {
		System.out.println(this.name+" 이 "+damage+" 만큼 피해를 입었습니다.");
		this.hitpoint -= damage;
		
	}
	
	public boolean isDead() {
		return this.hitpoint <= 0;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Animal other) {
			return other.getName().equals(this.name);
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Animal [name=" + this.name + ", voice=" + this.voice + ", speed=" + this.speed + ", damage=" + this.damage + ", hitpoint="
				+ this.hitpoint + "]";
	}
	
	

}
