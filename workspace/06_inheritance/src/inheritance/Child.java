package inheritance;

public class Child extends Super{
	
	protected String name;
	protected int age;
	
	public Child() {
		System.out.println("Child 기본 생성자");
	}
	public Child(String name, int age, double weight, double height) {
		super(); // 부모 클래스의 생성자를 호출 할 수있다. 첫째 줄에서만 가능하다.
		System.out.println("Child 생성자");
		this.name = name;
		this.age = age;
		super.weight = weight;//this.weight = weight;
		this.height = height; //super.height = height;
	}
	public void disp() {
		System.out.println("이름 = "+name);
		System.out.println("나이 = "+age);
		System.out.println("몸무게 = "+weight);
		System.out.println("키 = "+height);
	}
	

	public static void main(String[] args) {
		
		Child aa = new Child("홍길동",25,70.5,182.3); //객체
		aa.disp();
		System.out.println();
	
		System.out.println("------------");
		
		Super bb = new Child("코난",13,35.6,152.7);
		bb.disp();
//		bb.output(); //부를 수 없음.
		
	}

}
