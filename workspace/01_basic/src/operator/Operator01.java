package operator;

import java.text.DecimalFormat;

public class Operator01 {

	public static void main(String[] args) {
		
		int money = 2543;
		
		int tho = (money%10000)/1000;
		int hun = (money%1000)/100;
		int ten = (money%100)/10;
		int one = money%10;
		
		DecimalFormat df = new DecimalFormat();
		String won = df.format(money);
		
		System.out.println("현금 " + won + "원");
		System.out.println("천의 자리 = " + tho);
		System.out.println("백의 자리 = " + hun);
		System.out.println("십의 자리 = " + ten);
		System.out.println("일의 자리 = " + one);
		
	}
}
