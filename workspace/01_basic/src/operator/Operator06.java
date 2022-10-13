package operator;

public class Operator06 {

	public static void main(String[] args) {
		
		boolean a = 25>36;
		System.out.println("a = " + a); //false
		System.out.println("!a = " + !a); //true
		System.out.println();
		
		String b = "apple"; //literal 생성   객체,  객체는 변수와 다르게 주소값을 가진다.
		String c = new String("apple");
			
		System.out.println("b == c : " + (b == c ? "같다" : "다르다")); // 주소값, 참조값을 물어보므로 다르다.
		System.out.println("b != c : " + (b != c ? "참" : "거짓")); 
		
		System.out.println("b.equals(c) : " + (b.equals(c) ? "같다" : "다르다"));
		System.out.println("!b.equals(c) : " + (!b.equals(c) ? "같다" : "다르다"));
		
	}

}
