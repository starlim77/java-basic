package multi;

public class MultiArray03 {

	public static void main(String[] args) {
		
		String[] name = {"홍길동", "프로도", "죠르디"};
		int[][] jumsu = {{90,95,100,0},{100,89,75,0},{75,80,48,0}};
		double[] avg = new double[3];
		char[] grade = new char[3];
		for(int i=0;i<jumsu.length;i++){
			int mscore = 0;
			int mgrade=0; //
			for(int j=0;j<jumsu[i].length-1;j++){
				jumsu[i][jumsu[i].length-1]+=jumsu[i][j];
			}
			avg[i] = jumsu[i][jumsu[i].length-1]/(jumsu[i].length-1);
//			if(avg[i]>=90) {
//				grade[i]='A';
//			}else if(avg[i]>=80){
//				grade[i]='B';
//			}else if(avg[i]>=70){
//				grade[i]='C';
//			}else if(avg[i]>=60){
//				grade[i]='D';
//			}else grade[i]='F';
			System.out.println(mgrade);
			for(int k=0;k<4;k++) {
				if(avg[i]<70+mscore && avg[i]>=60+mscore) grade[i]=(char)(68-mgrade); //
				mscore+=10;
				mgrade+=1;
			}
			
		}
		for(int i=0;i<name.length;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;j<jumsu[i].length;j++) {
						System.out.print(jumsu[i][j]+"\t");
			}//for i
			System.out.print(avg[i]+"\t"+grade[i]);
			System.out.println();
		}//for j
	}

}

/*
----------------------------------------------------
이름      국어      영어      수학      총점      평균      학점
----------------------------------------------------
홍길동	 90       95      100
프로도   	 100      89      75
죠르디   	 75       80      48
----------------------------------------------------
*/