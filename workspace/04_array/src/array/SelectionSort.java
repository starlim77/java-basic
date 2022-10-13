package array;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int ar[] = {35, 48, 25, 72, 50};
		
		System.out.print("정렬 전 : ");
		for(int data : ar) {
			System.out.print(data+"  ");
		}
		System.out.println();
		
		//Arrays.sort(ar);
		int mem = 0; // 보편적 변수명 : temp
		for(int i=0;i<ar.length-1;i++){ // ar.length -> ar.length-1
			for(int j=i+1;j<ar.length;j++){
				if(ar[i]>ar[j]) { //오름차순, < 내림차순.
					mem = ar[i];
					ar[i] = ar[j];
					ar[j] = mem;
				}
			}
		}
		
		
		System.out.print("정렬 후 : ");
		for(int data : ar) {
			System.out.print(data+"  ");
		}
		System.out.println();
	}

}//bubble sort 는 따로;
