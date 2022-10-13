package nested;

public class AbstractMain {

//	@Override
//	public void aa() {}
//	@Override
//	public void bb() {}
	
	public static void main(String[] args) {
		
		AbstractTest at = new AbstractTest() {// 익명 inner 클래스
			@Override
			public void setName(String name) {
				this.name = name;
			}
		};
		
		InterA ia = new InterA() {// new intA 가 아닌 익명 클래스가 new 된 것이다
			public void aa() {}
			public void bb() {}
		}; // 이 구조를 가장 많이 사용한다
		
		AbstractExam ae = new AbstractExam() {
			//추상메소드가 없기 때문에 원하는 메소드를 골라서 override 하면 된다.
		};
		
	}
}

