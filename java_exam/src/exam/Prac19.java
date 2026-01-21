package exam;

public class Prac19 {
	public static String pass(int subA, int subB, int subC ) {
		int sum = subA+subB+subC;
		double average = calcAverage(sum,3);
		String result = calcPass(average);
		return result;
	}
	public static double calcAverage (int sum, int subjectCount ) {
		double score = (double)sum / (double) subjectCount;
		return score;
	}
	
	public static String calcPass(double average) {
		if(average>=70) {
		 return "합격";
		}
		else {
			return "불합격";
			}
	}
	public static void main (String[]args) {
		String result = pass(80,70,90);
		System.out.println(result);
		
		
	}

}
