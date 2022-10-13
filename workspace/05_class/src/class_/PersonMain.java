package class_;

import java.util.jar.Attributes.Name;

import javax.swing.text.DefaultStyledDocument;

class Person{
	private String name; // 필드, 자동 초기화, null
	private int age; 	//필드 초기화, 0
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String n) { //구현
		name=n;
	}
	public void setAge(int a) {
		age=a;
	}
	public void setData(String n, int a) {
		name = n;
		age = a;
	}
	public void setData() {} //overload 쌍둥이, 같은 이름으로 여러개의 메소드가 생기는 것을 overload라고 한다.
	
}

public class PersonMain {
	
	public static void main(String[] args) {
			
//		int aa;		//정수형 변수
//		double b;   //실수형 변수
		Person aa;   //객체
		aa = new Person(); //메모리 생성
		System.out.println("객체 aa => " + aa);
		
//		aa.name = "홍길동";
//		aa.age = 25;
//		System.out.println("이름 = " + aa.name);
//		System.out.println("나이 = " + aa.age);
		aa.setName("홍길동");
		aa.setAge(25);
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		
		Person bb = new Person();
		System.out.println("객체 bb => " + bb);
		bb.setName("코난");
		bb.setAge(13);
		System.out.println(bb.getName());
		System.out.println(bb.getAge());
		
		Person cc = new Person();
		cc.setData("둘리", 100);
		System.out.println(cc.getName());
		System.out.println(cc.getAge());
		
		Person dd = new Person();
		dd.setData();
		
	}

}
