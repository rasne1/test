package exam;

public class prac8 {
	public static void main (String [] args) {
		
		int a = 10_000;
		
		for(int b= 2; b<a; ++b) {
			boolean f = true;
		for(int c= 2; c<b; ++c) {
			if(c*c==b) {
				f=false;
				break;
			}
		}
		 if (f) {
		System.out.println(b);
		}
}
	}
}

	


