package operator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		
		System.out.print("이름 입력 : ");
		String name = s.next();
		System.out.print("직급 입력 : ");
		String position = s.next();
		System.out.print("기본급 입력 : ");
		int basePay = s.nextInt();
		System.out.print("수당 입력 : ");
		int extraPay = s.nextInt();
		
		int sum = basePay + extraPay;
		double taxRate = 0;
		
		taxRate = sum < 3000000 ? 0.01 : taxRate;
		taxRate = sum >= 3000000 && sum < 5000000 ? 0.02 : taxRate ;
		taxRate = sum >= 5000000 ? 0.03 : taxRate ;
		
//		taxRate = sum < 3000000 ? 0.01 : sum >= 3000000 && sum < 5000000 ? 0.02 : 0.03;
		
		int tax = (int)(sum * taxRate);
		int monthlyPay = sum - tax;
		
		System.out.println("*** " + name + " " + position +" 월급 ***");
		System.out.println("기본급 : " + df.format(basePay));
		System.out.println("수당 : " + df.format(extraPay));
		System.out.println("합계 : " + df.format(sum));
		System.out.println("세금 : " + df.format(tax));
		System.out.println("월급 : " + df.format(monthlyPay));
//		System.out.println(taxRate);
		
		
	}

}
/*
[문제] 월급 계산 프로그램 - 조건연산자
이름, 직급, 기본급, 수당을 입력하여, 세금, 월급을 출력하시오.
단 합계가 5,000,000원 이상이면 3%
3,000,000원 이상이면 2%
아니면 1%

합계 = 기본급 + 수당
세금 = 합계 * 세율
월급 = 합계 - 세금

[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 : 4900000
수당 입력 : 200000

*** 홍길동 부장 월급 ***
기본급 : 4,900,000원
수당 : 200,000원
합계 : 5,100,000원
세금 : 153,000원
월급 : 4,947,000원 
 */
