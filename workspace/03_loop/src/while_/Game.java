package while_;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int com = (int)(Math.random()*100+1);
			System.out.println("1~100사이의 숫자를 맞추세요 " + com);
			int count = 0;
			
			while(true) {
				System.out.print("숫자 입력 : ");
				int user = scan.nextInt();
				count++;
				if(user<com) {
					System.out.println(user+"보다 큰 숫자입니다");
				}else if(user>com) {
					System.out.println(user+"보다 작은 숫자입니다");
				}else break;
			}//while
			System.out.println("딩동댕~ "+count+"번만에 맞추셨습니다");
			System.out.println("\n또 할래?(Y/N)");
//			int yn = scan.nextInt();  // 'Y'
			String yn = scan.next();
			
			if(yn.equals("N")||yn.equals("n")) break;
		}//while
		System.out.println("프로그램 종료합니다");
	}

}
/*
[문제] 숫자 맞추기 게임
- 컴퓨터가 1~100사이의 난수를 발생하면, 발생한 난수를 맞추는 게임
- 몇 번 만에 맞추었는지 출력한다.

[실행결과]
1~100사이의 숫자를 맞추세요 (com)

숫자 입력 : 50  (user)
50보다 큰 숫자입니다
숫자 입력 : 80
80보다 작은 숫자입니다
~
숫자 입력 : 77
딩동댕~ x번만에 맞추셨습니다.
*/