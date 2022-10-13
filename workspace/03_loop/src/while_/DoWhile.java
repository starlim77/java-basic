package while_;

public class DoWhile {

	public static void main(String[] args) {
		
		char ch = 'A';
		
		do {
			System.out.print(ch+" ");
			ch++;
			if((ch-65)%7==0) System.out.println();
			
		}while(ch<='Z');
		
		
		
	}

}
