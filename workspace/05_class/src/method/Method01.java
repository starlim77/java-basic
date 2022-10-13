package method;

public class Method01 {

	public static void main(String[] args) {
		
		Method01 m = new Method01();
		
		int a=25, b=36;	//지역변수, local variable
		int sum = m.sum2(a,b);
		int sub = m.sub2(a,b);
		int mul = m.mul2(a,b);
		double div = m.div2(a,b);
		System.out.println(a +" "+b);
		System.out.println(sum+" "+sub+" "+mul+" "+String.format("%.2f",div));
	}
	
	public int sum2(int a, int b){ //인수(argument), 매개변수(parameter)
		return a+b;
	}
	public int sub2(int a, int b){ 
		return a*b;
	}
	public int mul2(int a, int b){ 
		return a*b;
	}
	public double div2(double a, int b){ 
		return a/b;
	}
	
	
}
