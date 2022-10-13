package multi;


public class MultiArray04 {

	public static void main(String[] args) {
		
		int[][] ar = new int [3][];
		
		int y = 3;
		int num=10;
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length+i;j++) {
				ar[i] = new int [ar.length+i];
				ar[i][j] = num;
				num+=10;
				y+=1;
				System.out.print(ar[i][j]+" ");
			}//for j
			System.out.println();
		}//for i
		
	}

}
