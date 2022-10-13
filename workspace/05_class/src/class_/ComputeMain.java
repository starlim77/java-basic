package class_;

import java.util.Scanner;

public class ComputeMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Compute[] com = new Compute[3]; // 결합도 (100%) 1:1 관계.
//		Object[] com = new Compute[3]; 결합도가 낮아짐..
//		com[0] = new SungJuk();   클래스의 종류와 상관 없이 받으려면.. 
//		Object[] com = new Object[3];  // 다형성, 
		for(int i=0; i<com.length;i++) {
			com[i] = new Compute();
			System.out.print("X 입력 : ");
			com[i].setX(scan.nextInt());
			System.out.print("Y 입력 : ");
			int y = scan.nextInt();
			com[i].setY(y);
			System.out.println();
			com[i].calc();
		}
		
		System.out.println("X\tY\tSUM\tSUB\tMUL\tDIV");
		for(Compute a:com) {
			
			System.out.println(
					a.getX()+"\t"+
					a.getY()+"\t"+
					a.getSum()+"\t"+
					a.getSub()+"\t"+
					a.getMul()+"\t"+
					String.format("%.2f",a.getDiv())+"\t"
					);
		}
	}

}
/*
객체배열을 이용하여 작성하시오
데이터는 키보드로부터 입력 받으세요

클래스명 : Compute
필드 : int x,y,sum,sub,mul
       double div
메소드 : setX(~)
       setY(~)
       calc() - 합차곱몫을 계산
       getX()
       getY()
       getSum()
       getSub()
       getMul()
       getDiv()

클래스명 : ComputeMain

[실행결과]
x 입력 : 320
y 입력 : 258

x 입력 : 256
y 입력 : 125

x 입력 : 452
y 입력 : 365


X      Y      SUM      SUB      MUL      DIV
320      258
256      125
452      365
*/