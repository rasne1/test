package exam;

public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test = 74;
		
		
		if (test >= 90) {
			System.out.println("A");
		}
		else if (test<90 && test >= 80) {
			System.out.println("B");
		}
		else if (test <80 && test >= 70) {
			System.out.println("c");
		}
		else if (test <70 && test >= 60) {
			System.out.println("D");
		}
		
		else {
			System.out.println("F");
		}
		
		int year = 1999;
		
		if (year%4==0 && (year%400==0 || year%100 != 0)) {
			System.out.println("1");
			
		}
		else if (year%4!=0 && (year%400!=0 || year%100 == 0)) {
			System.out.println("0");
			
		}
		
		
		
		int x = 3;
		int y = -12;
		
		if (x>0 && y>0 ) {
			System.out.println("Quadrant1");
		}
		else if (x<0 && y>0 ) {
			System.out.println("Quadrant2");
		}
		else if (x<0 && y<0 ) {
			System.out.println("Quadrant3");
		}
		else if (x>0 && y<0){
			System.out.println("Quadrant4");
		}
		else {
			System.out.println("0");
		}
		
		int H = 0;
		int M = 30;
		int K = 45;
		
		int wakeUpTime = ((H*60)+M-K);
		
		H=wakeUpTime/60;
		M=wakeUpTime%60;
		
		if (M<0){
			M+=60;
			H--;
			
		}
		
		if (H<0){
			H=23;
		}
		
		System.out.println(H+"시"+ M+"분");
		
		int H2 = 23;
		int M2 = 48;
		int K2 = 20;
		
		int cookTime=((H2*60)+M2+K2);
		
		H2=cookTime/60;
		M2=cookTime%60;
	
		if (H2>=24) {
			H2=0;
		}
		System.out.println(H2+"시"+M2+"분");
		
		int d1 = 6;
		int d2 = 2;
		int d3 = 5;
		int money = 0;
		int max =0;
		
		
		if (d1 == d2 && d2 == d3) {
			money = 10_000+(d1*1000);
		}
		else if (d1==d2 ) {
			money = (1000+(d1*100));
		}
		else if (d1==d3 ) {
			money = (1000+(d1*100));
		}
		else if (d2==d3 ) {
			money = (1000+(d2*100));
		}
		
		else if (d1 != d2 && d1 !=d3 && d2 != d3) {
		
		
		if(d1 > d2 && d1 > d3)
		max=d1;
		
		if (d2>d1 && d2>d3)
		max=d2;
		
		if (d3>d1 && d3>d2)
		max=d3;
		
		money=max * 100;
		}
		
		System.out.println(money);
		
		
		int angle = 90;

		if (angle > 0 && angle < 90 ) {
			System.out.println("예각");
		}
		else if (angle == 90 ) {
			System.out.println("직각");
		}
		else if (angle > 90 && angle < 180 ) {
			System.out.println("둔각");
		}
		else if (angle == 180 ) {
			System.out.println("평각");
		}
		
		int s = 64;
		int d = 6;
		int f=0;
		
		if (s>=10) {
			f=s/10;
			d=d-f;
		}
		int total = ((s*12000)+(d*2000));
		System.out.println(total);
		
	}

}
