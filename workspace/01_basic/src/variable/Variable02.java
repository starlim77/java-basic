package variable;

public class Variable02 {
	
	static int a; // 필드, 초기화 되어 있다.
	int b; // 필드, 초기화 되어 있다.

	public static void main(String[] args) {
		
		int a = 5 ; // local variable (지역 변수), 쓰기값, 반드시 초기화 해야 한다.
		
		System.out.println("지역변수 a = " + a);
		System.out.println("필드 a = " + Variable02.a);
		System.out.println("필드 b = " + new Variable02().b);
		
	}

}
