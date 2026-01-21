package java_exam;

public class ArrayExam {

	public static void main(String[] args) {
		
		int [] scoreArray = new int [7];
		
		
		for(int i = 0; i< scoreArray.length; ++i) {
		scoreArray [i]=(int)(Math.random()*45+1);
		
			for(int j = 0; j< i; ++j) {
				scoreArray [j]=(int)(Math.random()*45+1);
				
				if( scoreArray [i] == scoreArray [j]) {
					i--;
					//s = false;
					break;
				}
			}
		}
		for (int i = 0; i<scoreArray.length; ++i){
		System.out.println(scoreArray[i]+" ");
		}		
	}
}
	
