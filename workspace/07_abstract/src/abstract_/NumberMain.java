package abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain {

	public static void main(String[] args) {
		
//		NumberFormat nf = new NumberFormat();  // 3자리마다 , - 추상클래스
		NumberFormat nf = new DecimalFormat(); // 3자리마다, 찍고 소수이하 3째자리(반올림)까지 출력
		System.out.println(nf.format(12345678.456789));
		System.out.println(nf.format(12345678));
		System.out.println();
		
		NumberFormat nf2 = new DecimalFormat("#,###.##원"); //유효숫자가 아닌 것은 표현하지 않는다
		System.out.println(nf2.format(12345678.456789));
		System.out.println(nf2.format(12345678));
		System.out.println();
		
		NumberFormat nf3 = new DecimalFormat("#,###.00원"); //0을 강제로 표시
		System.out.println(nf3.format(12345678.456789));
		System.out.println(nf3.format(12345678));
		System.out.println();
		
		//NumberFormat nf4 = NumberFormat.getInstance(); //메소드를 이용해도 된다. 클래스를 생성하는 메소드.
		NumberFormat nf4 = NumberFormat.getCurrencyInstance();//₩ 표시
		nf4.setMaximumFractionDigits(2); //소수이하 2째 자리
		nf4.setMinimumFractionDigits(2); //0을 강제로 표시. 유효숫자가 아닌 0도 강제로 표시
		System.out.println(nf4.format(12345678.456789));
		System.out.println(nf4.format(12345678));
		System.out.println();
		
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US); // $ 표시
		nf5.setMaximumFractionDigits(2); //소수이하 2째 자리
		nf5.setMinimumFractionDigits(2); //0을 강제로 표시. 유효숫자가 아닌 0도 강제로 표시
		System.out.println(nf5.format(12345678.456789));
		System.out.println(nf5.format(12345678));
		System.out.println();
	}

}
