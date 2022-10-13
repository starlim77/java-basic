package while_;

public class While01 {

	public static void main(String[] args) {
		
		int a = 1;
		while(a<=10) {
			System.out.print(a + " ");
			a++;
		}//while
		System.out.println();
		
		//  1 2 3 4 5 6 7 8 9 10
		int b = 0;
		while(b<=9) {
			b++;
			System.out.print(b+" ");
		}//while
		System.out.println();
		
		int c=0;
		while(true) {
			c++;
			System.out.print(c+" ");
			if(c==10) break;
		}//while
		
	}

}
