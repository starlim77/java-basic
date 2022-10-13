package collection;

import java.util.Stack;
import static java.lang.System.out;

public class StackMain {//last in first out  LIFO구조, collection의 일종,    함수의 메모리 구조로 사용됨.

	public static void main(String[] args) {
		
		String[] groupA = {"우즈베키스탄", "쿠웨이트", "사우디", "대한민국"};
		Stack<String> stack = new Stack<String>();
		
		for(int i=0; i<groupA.length;i++)
			stack.push(groupA[i]);
		while(!stack.isEmpty())
			out.println(stack.pop());
		
		
		
	}

}
