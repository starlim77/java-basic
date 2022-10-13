package abstract_;

public class AbstractMain extends AbstractTest{
	
	@Override
	public void setName(String name) {
		this.name = name;
	}; //반드시 override

	public static void main(String[] args) {
		
//		AbstractTest at = new AbstractTest(); //추상클래스는 new 할 수없다. 메모리 생성을 할 수 없다.
		AbstractTest at = new AbstractMain(); // 
		
		
	}

}// override를 시키기 위해서 추상클래스를 사용한다.
