package exam;

public class rakel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int korscore = 45;
int engscore = 88;
int mathscore =70;
int progscore = 80;

int sum = (korscore + engscore + mathscore + progscore);
System.out.println("합계점수"+sum);
int average = ( sum/4);
System.out.println("평균점수"+average);
if (average > 95) {
	System.out.println("성적 A+ ");
}
else if (average > 90) {
	System.out.println("성적 A ");
}
else if (average > 85) {
	System.out.println("성적 B+ ");
}
else if (average > 80) {
	System.out.println("성적 B ");
}
else if (average >= 70) {
	System.out.println("성적 C ");
}
else if (average < 70) {
	System.out.println("성적 F ");
}
	}
}
