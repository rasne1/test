package java_exam;

public class Variables1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 중요한 타입 ( int long float double boolean )
		// 나이가 몇살인지 구해보는 나이 계산기 
		//현재 년도- 나의 새연ㄴ
		System.out.println(2026-1991+1);
		
		// Var Naming convention
		// 1.첫 번쨰 단어의 첫 번쨰 글자는 소문자로 작성
		// 2. 두번쨰 이후의 단어의 첫 번쨰 글자만 대문자로 작성 (camel case)
		// 3. 특수기호 나 숫자로 시작할수 없다 
		// 4. 사용가능한 특수기호 (_)언더바 는 권장하지 않음
		{
			int nowYear = 2026;
			int myBirthYear = 1991;
			int myAge = nowYear - myBirthYear +1;
			
		System.out.println(myAge);
		}
		
		final long price = 1000;
		long buildingPrice = 10_000_000_000L;
		float ratio = 5.111f;
		double doubleratio = 32123.351515151532;
		
		int ra = (int)1L;
		long num = Integer.MAX_VALUE;
		num= num + 1;
		System.out.println(num);
		
		byte bnumber = 127;
		//bnumber = bnumber +(byte)1;
		bnumber = (byte)(bnumber +1); // 명시적 형변환 
		
		System.out.println ("3 + 7의 결과는 "+ (3 + 7) );
		
		System.out.println(10L+3.5f);
		System.out.println(10 / (double)3);
		
	
	System.out.println("\"계산 끝났습니다.\"");
	
	}

}
