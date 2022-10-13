package operator;

public class Boxing {

	public static void main(String[] args) {
		
		int a = 25;
		double b = a/3; // Casting (강제형변환)
		
		String c = "25";
//		int d = (int)c;  // 기본형은 기본 끼리, 객체는 객체끼리.
		int d = Integer.parseInt(c);
		
		System.out.println(d);
		
		// AutoBoxing
		int e =5;
		Integer f = e; // AutoBoxing
//		Integer g = new Integer(e); // JDK 5.0 이전
		
		Integer h = 5;
		int i = h; //unAutoBoxing - JDK 5.0
//		int j = h.intValue(); //JDk 5.0 이전
		
	}

}
