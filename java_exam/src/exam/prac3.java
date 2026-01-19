package exam;

public class prac3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int n=1; n<9; ++n) {
			int a =2;
			int b=a*n;
			System.out.println(a+"x"+n+"="+b);
			
			
		}
		int d= 10;
		int e= 0;
		for(int c = 1; c <= d; ++c ) {
			e=e+c;
			
		}
		System.out.println(e);
	
		
		int h =10;
		int j = 0;
		
		for(int g = 1; g<=h; ++g ) {
			if(g%3==0) {
				j=j+g;
			}
			
		}
		
		System.out.println(j);
		
		int k = 20;
		int m = 0;
		for(int v=1; v<=k; ++v) {
			if(v%2==0 && v%3==0) {
				m +=v;
			}
			
		}
		System.out.println(m);
		
		
		
	}
	

}
