package inheritance;



public class Sub extends Super{
	
	protected String name;
	protected int age;
	
	public Sub() {
		System.out.println("Sub 기본 생성자");
	}
	public Sub(String name, int age, double weight, double height) {
		System.out.println("Sub 생성자");
		this.name = name;
		this.age = age;
		super.weight = weight;//this.weight = weight;
		this.height = height; //super.height = height;
	}
	public void output() {
		System.out.println("이름 = "+name);
		System.out.println("나이 = "+age);
		System.out.println("몸무게 = "+weight);
		System.out.println("키 = "+height);
	}
	
	public static void main(String[] args) {

		Sub aa = new Sub("홍길동",25,70.5,182.3); //객체
		aa.disp();
		System.out.println();
		aa.output();
		System.out.println("------------");
		
		Super bb = new Sub("코난",13,35.6,152.7);
		bb.disp();
//		bb.output(); //부를 수 없음.
		
	}

}
