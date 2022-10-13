package abstract_;

public abstract class AbstractTest {//POJO 형식 (Plain Old Java Object) 순수한 자바 클래스, original type

	String name; // default --> 같은 패키지 내의 클래스끼리는 접근이 가능하다.
	
	public String getName() { // {} 메소드의 구현
		return name;
	}
	
	public abstract void setName(String name); //추상메소드
	
// 추상메소드를 만들면 클래스도 추상클래스로 만들어주어야 한다.
// 추상클래스에는 추상메소드가 존재하지 않을 수 있다.

}
