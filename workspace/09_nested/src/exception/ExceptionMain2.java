package exception;

import java.util.Scanner;

public class ExceptionMain2 {
	
	private int x,y;
	
	public void input() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x 입력 : ");
		x = scanner.nextInt();
		System.out.print("y 입력 : ");
		y = scanner.nextInt();
	}
	public void output() {
		System.out.println(x+"의 "+y+"승은 "+Math.pow(x, y));
		
		if(y<0) {
			
			
			try {
			//개발자가 강제로 Exception 발생
				throw new Exception("y는 0보다 크거나 같아야 한다");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {

		ExceptionMain2 exceptionMain2 = new ExceptionMain2();
		
		exceptionMain2.input();
		exceptionMain2.output();
		
	}

}
