package multi;


public class MultiArray01 {// 다차원 배열

	public static void main(String[] args) {
		
		int[][] ar = new int[3][2]; // 동적 할당.
		
		
		
		int data=10;
		
		for(int i=0;i<ar.length;i++) { //행
			for(int j=0;j<ar[i].length;j++) { //열
				ar[i][j]=data;
				data+=10;
				System.out.println("ar["+i+"]["+j+"] = " + ar[i][j]);
			}
			System.out.println();
		}
		
	}

}
