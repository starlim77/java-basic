package if_;

import java.util.Scanner;
import java.util.PrimitiveIterator.OfDouble;

public class If03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a의 값 : ");
		int a = scan.nextInt();
		System.out.print("b의 값 : ");
		int b = scan.nextInt();
		System.out.print("c의 값 : ");
		int c = scan.nextInt();
		
		int d;
		
		/*
		if(a<=b && a<=c) { //a가 가장 작은 경우
			if(b<=c) System.out.println(a + "," + b + "," + c);
			else System.out.println(a + "," + c + "," + b);
		}else if(b<=c) { // 비가 가장 작은 경우
			if(a<=c) System.out.println(b + "," + a + "," + c);
			else System.out.println(b + "," + c + "," + a);
		}else { //c가 가장 작은 경우
			if(a<=b) System.out.println(c + "," + a + "," + b);
			else System.out.println(c + "," + b + "," + a);
		}
		*/
		
		/*
		if(a>b) {
			d=a;
			a=b;
			b=d;	
		}
			if(b>c) {
				d=b;
				b=c;
				c=d;
			}
				if(a>b) {
					d=a;
					a=b;
					b=d;
				}
				*/
		
		if (a>b)
			if(a<c) {
				d=a;
				a=b;
				b=d;
			}
			else {
				d=b;
				b=c;
				c=d;
				d=a;
				a=b;
				b=d;
			}
		else {
			if(b>c) {
				d=b;
				b=c;
				c=d;
			}
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

}
