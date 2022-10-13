package nested;

public class Outer {
	
	private String name;
	
	public void output() {
		Inner in = new Inner();//객체를 이용해 접근 가능
		System.out.println("이름 = "+this.name+"\t나이 = "+in.age);// error age
	}

	class Inner { // class file > Outer$Inner.class
		private int age;
		
		public void disp() {// member inner class
			System.out.println("이름 = "+Outer.this.name+"\t나이 = "+this.age);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		Outer ou = new Outer();
		ou.name="홍길동";
		ou.output();
		System.out.println();
		
		Outer.Inner in2 = ou.new Inner();
		in2.age = 25;
		in2.disp();
		
		Outer.Inner in3 = ou.new Inner();
		in3.age = 30;
		in3.disp();
		
//		in3.name = "코난"; //접근 불가 static main - 클래스의 정의 부분에서만 접근 가능
		
		Outer.Inner in4 = new Outer().new Inner();
//		in4.name = "코난"; -ㄷ
		in4.age = 35;
		in4.disp();
		
	}

}

/*
class AA{

	필드
	메소드(){} //구현.   메소드를 넣을 수 있는 것이 클래스의  특징
	class BB{} //inner class, member inner class(클래스 안의 클래)    클래스 안에 클래스를 정의할 수 있다.
	static class CC{} // static class
	
	
	메소드(){
		class CC{} //메소드 안의 클래스 로컬 내부 클래스 local inner class
	}
	{} 익명 내부 클래스 anonymous inner class 
	
	
}


*/
