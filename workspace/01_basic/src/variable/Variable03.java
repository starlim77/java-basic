package variable;

import java.util.Random;

public class Variable03 {

	public static void main(String[] args) {
		
		System.out.println("큰 값 = " + Math.max(25, 36));
		System.out.println("큰 값 = " + Math.max(28.9, 55.8));
		
		/*
		 	난수 
		- 컴퓨터가 불규칙하게 발생하는 수
		- 0 <= 난수 < 1
		- a ~ b 사이의 난수 발생 > (int)(Math.random()*(b-a+1)+a)
		*/

		System.out.println( Math.random());
		System.out.println((int)(Math.random() * 26 + 65));
		System.out.println((char)(Math.random() * 26 + 65));
		
		System.out.println(new java.util.Random().nextDouble());
		System.out.println(new Random().nextDouble());
		
	}	
}
