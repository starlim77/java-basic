package array;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto_ {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		
		System.out.print("현금입력 : ");
		int cash = scan.nextInt();
		int lottos = cash/1000;
		
		int[] lotto = new int[6];

		for(int h=0;h<lottos;h++) {
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]=(int)(Math.random()*45+1);
			for (int j = 0; j > i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					continue;
				} // if
			}// for j
		}//for i
		Arrays.sort(lotto);
		for(int i = 0; i < lotto.length; i++) System.out.print(String.format("%5d", lotto[i]));
		System.out.println();
		if((h+1)%5==0) System.out.println();
		}
		
	}

}
