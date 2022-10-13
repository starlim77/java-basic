package collection;

class GenericTest<T>{
	private T a;

	public void setA(T a) {
		this.a = a;
	}
	public T getA() {
		return a;
	}
}
//----
public class GenericMain {

	public static void main(String[] args) {
		
		GenericTest<Object> aa = new GenericTest<Object>();
		aa.setA("홍길동");
		aa.setA(100);
		System.out.println("이름 = "+aa.getA());
		
		
		GenericTest<Integer> bb = new GenericTest<Integer>();
		bb.setA(25);
		System.out.println("나이 = "+bb.getA());
		
	}

}
