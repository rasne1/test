package exam;

public class prac7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 100_000;
	
		for(int b=2; b<=a; ++b) {
			if (b!=2 && b%2==0) {
				continue;
			}
			boolean s =true;
		for(int j = 2; j < b; j++) {
			if(b%j ==0) {
			s = false;
			break;
			}
		}
			if(s) {
		System.out.println(b);
		}
	}
}
	}

			 
			
			
		
		

