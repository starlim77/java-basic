package for_;

import java.util.Scanner;

public class For07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력(1~10) : ");
		int num = scan.nextInt();
		int i;
		int fac=1;
		for(i=1;i<=num;i++) {
			fac *= i;
		}
		System.out.print(num+"! = "+fac+" ");
		
		System.out.print("(");
		for(i=1;i<=num-1;i++) {
		System.out.print(i+"*");
		}
		System.out.print(num + ")");
		
	}

}
/*
For07.java
[문제] 팩토리얼을 구하시오 (for)
- 입력되는 숫자는 1 ~ 10 사이만 입력한다.

[실행결과]
숫자 입력 : 3
3! = 6 (1*2*3)
-------------------------
숫자 입력 : 9
9! = 362880 (1*2*3*...*9)
*/
