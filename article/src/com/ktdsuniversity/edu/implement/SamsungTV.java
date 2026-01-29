package com.ktdsuniversity.edu.implement;

/**
 * before
 * 
 * tv
 * samsungsmartTv
 * samsungtv( tv + smasungsmarttv)
 * lgsmarttv
 * lgtv(
 * 
 * 
 * 
 * 
 * 
 * after
 * TV
 *  -SamsungSmartTV
 *          -SamsungTV
 *  -LgSmartTV
 *       -Lgtv
 * 
 * 
 */





public class SamsungTV implements  SamsungSmartTV{

	@Override
	public void turnOn() {
		System.out.println("삼성 티비를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		
		System.out.println("삼성 티비를 끕니다.");
		
		
	}

	@Override
	public void changeChannel(int ChannelNumber) {
		System.out.println("삼성티비의 채널을 바꿉니다: "+ChannelNumber);
		
	}

	@Override
	public void changeVolumn(int volumn) {
		System.out.println("삼성티비의 볼륨을 바꿉니다 : "+volumn);
		
	}

	@Override
	public void runNetflix() {
		
		System.out.println("삼성티비의 넷플릭스를 실행합니다");
		
		
	}

	@Override
	public void runMenu() {
		System.out.println("삼성티비의 메뉴를 실행합니다");
		
	}

	@Override
	public void runCupangPlay() {
		
		System.out.println("삼성티비의 쿠팡플레이를 실행합니다");
	}
	
	
	
	

}
