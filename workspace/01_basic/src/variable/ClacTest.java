//[문제] 변수를 이용하여 320, 258의 합,차, 곲, 을 구하시오.

/*[실행결과]
320 + 258 = xxx
...
...
 */

package variable;
import java.text.DecimalFormat;

public class ClacTest {

	public static void main(String[] args) {
		
		short a = 320, b = 258;
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		double div = (double)a / b; // 강제형변환 / 자동형변환
		
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " - " + b + " = " + sub);
		System.out.println(a + " X " + b + " = " + mul);
		System.out.println(a + " / " + b + " = " + String.format("%.5f", div));
		
		System.out.println(a + " X " + b + " = " + new DecimalFormat().format(mul) ); // 3자리마다 쉼표
		
	// DecimalFormat = new DecimalFormat();
	// System.out.println(a + " X " + b + " = " + haha.format(mul) ); // 3자리마다 쉼표
		
	}

}
