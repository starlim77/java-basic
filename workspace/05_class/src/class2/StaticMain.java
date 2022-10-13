package class2;

class StaticTest{
	private int a;//필드
	private static int b;//필드, 클래스 변수   , 공유 변수
	
	static {
		System.out.println("초기화 영역");
		b=7;
	}
	
	public StaticTest() {
		System.out.println("기본 생성자");
		this.a=7;
	}
	
	public void calc() {
		a++;
		b++;
	}
	public void disp() {
		System.out.println("a="+a+"\t b="+b);
	}
	public static void output() {
		System.out.println("static method...");
//		System.out.println("a="+a+"\t b="+b); // static 영역 안에는 this 값이 없다. static 함수는 static 변수만 가능
	}
}
//-------------
public class StaticMain {

	public static void main(String[] args) {
		
		StaticTest st = new StaticTest();
		st.calc();
		st.disp();
		System.out.println();
		
		StaticTest st1 = new StaticTest();
		st1.calc();
		st1.disp();
		System.out.println();
		
		StaticTest st2 = new StaticTest();
		st2.calc();
		st2.disp();
		System.out.println();
		
		StaticTest.output();// 클래스명.메소드()
		st.output();
	}

}
