package multi;

public class MultiArray02 {

	public static void main(String[] args) {
		
		int[][] ar = new int[10][10];
		int num=0;
		
//		for(int i=0;i<ar.length;i++) {
//			for(int j=0;j<ar[i].length;j++) {
//				num= num+1;
//				ar[i][j]=num;
//			}
//		}
		
//		for(int j=0;j<ar.length;j++) {
//			for(int i=0;i<ar[j].length;i++) {
//				num = num+1;
//				ar[i][j]=num;
//			}
//		}
		
		num=100;
		for(int i=0;i<ar.length;i++) { // num=0 i=ar.length-1; i>=0;i--
			for(int j=0;j<ar[i].length;j++) {// j=ar[i].length-1; j>=0;j--
				ar[i][j]=num;
				num-=1;
		}
	}
		
//		for(int j=0;j<ar.length;j++) {
//			for(int i=0;i<ar.length;i++) {
//				num = num+1;
//				ar[i][j]=num;
//			}
//		}
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(String.format("%4d", ar[i][j]));
			}
			System.out.println();
		}
		
		
	}

}
