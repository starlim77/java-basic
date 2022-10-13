package array;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("현금입력 : ");
		int cash = scan.nextInt();
		int lottos = cash/1000;
		
		int[] lotto = new int[6];
		
		for(int k = 0;k<lottos;k++) {
			for(int i=0;i<lotto.length;i++) {
				LOOP:while(true) {
					lotto[i]=(int)(Math.random()*45+1);
					for(int j=i;j>0;j--) {
						if(lotto[i]==lotto[j-1]) continue LOOP;
					}//for j
					break;
				}//while
//				System.out.print("\t"+lotto[i]+"\t");
			}//for i
			Arrays.sort(lotto);
			for(int i=0;i<lotto.length;i++) {
				System.out.print(String.format("%4d", lotto[i]));
			}
			System.out.println();
			if((k+1)%5==0) System.out.println();
		}//for k
	}
}