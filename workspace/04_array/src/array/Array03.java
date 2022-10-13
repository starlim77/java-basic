package array;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열 크기 입력 : ");
		System.out.println();
		int size = scan.nextInt();
		int[] num = new int[size];
		
		for(int i=0; i<num.length; i++) {
			System.out.print("ar["+i+"] 입력 : ");
			num[i] = scan.nextInt();
		}
		System.out.println();
				
		int sum = 0;
		int min;
		int max=min=num[0];
		for(int data:num) {
			System.out.print(data+" ");
			sum += data;
			if (data>max) max=data;
			if(data<min) min=data;
		}
		System.out.println();
		System.out.println("합 = "+ sum);
		System.out.println("최대값 = "+ max);
		System.out.println("최소값 = "+ min);
	
	}
}
	

