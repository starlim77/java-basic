package class_;

class This {
	private int a=0; //필드
	
	public void setA(int a){//인수
		System.out.println("this = "+this);
		this.a= a;
	};
	public int getA() {
		return a; //this 생략
	}
	
}


//--------
public class ThisMain {

	public static void main(String[] args) {
		This t = new This();
		System.out.println("객체 t = "+t);
		t.setA(10);
		System.out.println(t.getA());
		
		This a = new This();
		System.out.println(a);
		a.setA(20);
		System.out.println(a.getA());
	}

}
