
package operator;

import java.util.Scanner;

public class Operator03 {

	public static void main(String[] args) {
		
		int a = 2, b = 3;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력하시오 : ");
		int i = scan.nextInt();
		
		String result1 = i%a==0 ? "짝수" : "홀수";
		String result2 = i%a==0 && i%b==0 ? "이다" : " 아니다"; 
		
		System.out.println(i + "는 " + result1);
		System.out.println(i + "는 " + a + "와 " + b + "의 공배수"  + result2);
		
	}

}

/*[문제] 정수를 입력하여 짝수? 홀수?, 2와 3의 공배수이냥? 아니냥?

[실행결과]
정수 입력하시오 : 12
12는 짝수
12는 2와 3의 공배수이다
----------------------
정수 입력하시오 : 15
15는 홀수
15는 2와 3의 공배수 아니다 */