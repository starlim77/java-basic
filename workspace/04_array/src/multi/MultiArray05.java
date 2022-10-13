package multi;

import java.util.Scanner;

public class MultiArray05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("인원수 : ");
		int cnt = scan.nextInt();
		System.out.println();
		String[] name = new String[cnt];
	    int[] tot = new int[cnt];
		String[][] subject = new String[cnt][];
		int[][] jumsu = new int [cnt][];
		double[] avg = new double[cnt];
		int[] subjectCnt = new int [cnt];
		for(int j=0;j<cnt;j++) {
			System.out.print("이름입력 : ");
			name[j] = scan.next();
			System.out.print("과목수 입력 : ");
			subjectCnt[j] = scan.nextInt();
			subject[j] = new String[subjectCnt[j]];
			jumsu[j] = new int[subjectCnt[j]];
			for(int k=0;k<subjectCnt[j];k++) {
				System.out.print("과목명 입력 : ");
				subject[j][k] = scan.next();
			}//for k
			for(int k=0;k<subjectCnt[j];k++) {
				System.out.print(subject[j][k] +" 점수 입력 : ");
				jumsu[j][k] = scan.nextInt();
				tot[j] += jumsu[j][k];
			}//for k
			avg[j] = (double)tot[j]/subjectCnt[j];
		}//for j
		for(int i=0;i<cnt;i++) {
			System.out.print("이름\t");
			for(int j=0;j<subjectCnt[i];j++) {
				System.out.print(subject[i][j]+"\t");
			}
			System.out.println("총점\t평균");
			System.out.print(name[i]+"\t");
			for(int j=0;j<subjectCnt[i];j++) {
				System.out.print(jumsu[i][j]+"\t");
			}
			System.out.print(tot[i]+"\t");
			System.out.print(String.format("%.2f",avg[i])+"\t");
			System.out.println();
			System.out.println();
		}//for i
		
		
	}

}
/*
인원수를 입력하여 인원수만큼 데이터를 입력받고 총점과 평균을 구하시오
평균은 소수이하 2째자리까지 출력

[실행결과]
인원수 : 2 (cnt)

이름입력 : 홍길동 (name)
과목수 입력 : 2   (subjectCnt)
과목명 입력 : 국어 (subject)
과목명 입력 : 영어
국어 점수 입력 : 95 (jumsu)
영어 점수 입력 : 100
---------------------
이름입력 : 이기자
과목수 입력 : 3
과목명 입력 : 국어
과목명 입력 : 영어
과목명 입력 : 과학
국어 점수 입력 : 95
영어 점수 입력 : 100
과학 점수 입력 : 90
---------------------

이름     국어     영어   총점     평균
홍길동    95     100   xxx     xx.xx

이름   국어  영어   과학    총점      평균
이기자   95   100      90        xxx      xx.xx
*/