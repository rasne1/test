package com.ktdsuniversity.edu.implement;

public class Test {
	
	public static void main(String[] args) {
		LgSmartTV lgTV = new LgTV();
		LgRemoteController lgRemoteCon = new LgSmartRemoteController();
		lgRemoteCon.turnOn(lgTV);
		
		
		SamsungSmartTV samsungTV = new SamsungTV();
		lgRemoteCon.turnOn(samsungTV);
		
		
	}

}
