package interface_;

import java.util.Scanner;

public class ComputeService {
	
	public void menu() {
		
		Scanner scanner = new Scanner(System.in);
		int num;
		Compute compute=null; // 지역변수이므로 초기화 해줌.
		
		while(true) {
			System.out.println("****************");
			System.out.println(" 1. 합");
			System.out.println(" 2. 차");
			System.out.println(" 3. 곲");
			System.out.println(" 4. 몫");
			System.out.println(" 5. 끝내기");
			System.out.println("****************");
			System.out.print(" 번호 : ");
			num = scanner.nextInt();
			
			if(num==5) break;
			else if(num==1) {
				compute = new Sum(); // 부모 = 자식 (다형성)
			}
			else if(num==2) {
				compute = new Sub();
			}
			else if(num==3) {
				compute = new Mul();
			}
			else if(num==4) {
				compute = new Div();
			}
			compute.disp();
		}//while
	}//memu()
}
