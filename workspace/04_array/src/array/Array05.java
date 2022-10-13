package array;

public class Array05 {

	public static void main(String[] args) {
		
		char[] alpha = new char[50];
		int[] alphanum = new int[26];
		
		for(int i=0;i<alpha.length;i++) {
			alpha[i] = (char)(Math.random()*26+65); // 65~90
			System.out.print(alpha[i]+" ");
			if((i+1)%10==0) System.out.println();
			alphanum[alpha[i]-65]++;
		}
		System.out.println();
		for(int i=0; i<alphanum.length;i++) {
			System.out.println((char)(i+65)+" : "+alphanum[i]);
		}
		
	}

}
