package exam;

public class no25314 {
	public static void main(String[]args) {
			
			int N = 16;
			String type="";
			
			while (N >= 4) {
				type += "long ";
				N-=4;
			
		}
			type +="int";
			System.out.println(type);
	
	}
}
