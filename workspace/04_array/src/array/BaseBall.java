package array;

import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		LOOP:while(true) {
			System.out.print("게임을 실행하시겠습니까(Y/N) ");
			String run = scan.next();
			if(run.equals("N")||run.equals("n")) break;
			else if (run.equals("Y")||run.equals("Y"));
			else continue;
		
			System.out.println("게임을 시작합니다");
			int[] com = new int[3];
			for(int i=0;i<com.length;i++) {
				com[i]=(int)(Math.random()*9+1);
				for(int j=0;j<i;j++) {
					if(com[i]==com[j]) {
						i--;
						continue;
					}// if
				}//for j
			}//for i
			while(true) {
				System.out.print("숫자입력 : ");
//				int usernum = scan.nextInt();
//				int[] user = new int[3];
//			
//				int h=1000;
//				for(int i=0;i<3;i++) {
//					user[i]=((usernum)%h)/(h/10);
//					h=h/10;
//				}
				int[] user = new int[3];
				String usernum = scan.next();
				for(int i=0;i<com.length;i++) {
					user[i]=usernum.charAt(i)-48; // '0'=48 
				}
				
				int strike = 0;
				int ball = 0;
				
				for(int j=0;j<com.length;j++) {
					for(int i=0;i<user.length;i++) {
						if(com[i]==user[j] && i==j ) strike++;
						else if(com[i]==user[j] && i!=j) ball++;
					}
				}
				for(int comdata:com) System.out.print(comdata);
				System.out.println();
				System.out.println(strike+"스트라이크 "+ball+"볼");
				System.out.println();
				if(strike==3) break LOOP;
			}
		}//while
		System.out.println("프로그램 종료");
	}

}
/*
야구게임
크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다
발생한 수를 맞추는 게임
중복은 제거한다

[실행결과]
게임을 실행하시겠습니까(Y/N) : w
게임을 실행하시겠습니까(Y/N) : u
게임을 실행하시겠습니까(Y/N) : y

게임을 시작합니다

숫자입력 : 123
0스트라이크 0볼

숫자입력 : 567
0스트라이크 2볼

숫자입력 : 758
1스트라이크 2볼
...

숫자입력 : 785
3스트라이크 0볼
*/