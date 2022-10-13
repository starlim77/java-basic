package method;

public class Method02 {

	public void disp() {//구현
		System.out.println("non-static method");
	}
	
	public static void output() {//2
		System.out.println("static method");
	}
	
	public static void main(String[] args) {//1
		
		Method02.output(); //호출
		output();// Method02안이므로.
		
		Method02 m = new Method02();//static이 아니므로.
		m.disp();
		
	}
	
}//4
