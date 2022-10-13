package for_;

import java.util.Scanner;

public class For06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = scan.nextInt();
		int result = 0;
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				result += i;
				System.out.print("+"+i);
			}else {
				result -= i;
				System.out.print("-"+i);
			}
		}
		System.out.print(" = " + result);

		
	}

}
