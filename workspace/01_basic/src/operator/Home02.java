package operator;

public class Home02 {

	public static void main(String[] args) {
		
		char ch1 = 'c';
		
		/*
		int askii1 = (int)ch1;
		int askii2 = askii1 > 'Z' ? askii1 - 32 : askii1 + 32;
		int askii2 = askii1 > 90 ? askii1 - 32 : askii1 + 32; // 대문자와 소문자는 askii 코드 값 32 차이.
		char ch2 = (char)askii2;
		*/
		
		int ch2 = ch1 > 'Z' ? ch1 - 32 : ch1 + 32;
		
	//	int result = ch1 >= 'A' && ch1<= 'Z' ? ch1 + 32 : ch1 - 32;
		System.out.println(ch1 + " -> " + (char)ch2);
		
	}

}
/*
[문제] 변수의 값이 대문자이면 소문자로 변환해서 출력, 소문자이면 대문자로 변환해서 출력하시오

[실행결과]
B -> b         e -> E
*/