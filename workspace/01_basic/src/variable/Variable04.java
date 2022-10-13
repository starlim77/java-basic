package variable;

import java.util.Random;

public class Variable04 {

	public static void main(String[] args) {
		
		int a = 10; //정수형 변수, 지역변수
		System.out.println("지역변수 a = "+ a);
		System.out.println();
		
		Random r = new Random(); // 객체 ---      (클래스형 변수)
		System.out.println("객체 r = " + r);
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(100)); // 0~99
		System.out.println(r.nextInt(26) + 65); // 65 ~ 90
		System.err.println();
		
		String b = new String("사과");
		String c = "딸기"; // 문자열 literal 생성
		System.out.println(b + "\t" + c);
		
		
	}
}
