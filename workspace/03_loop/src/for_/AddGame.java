package for_;

import java.util.Scanner;

public class AddGame {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count;
		
		LOOP:while (true) {
				count = 0;
			for (int i = 1; i <= 5; i++) {
				int a = (int) (Math.random() * 90 + 10);  //10 ~ 99
				int b = (int) (Math.random() * 90 + 10);
				int sum = a+b;
//				System.out.print("["+i+"]"+" "+a+" + "+b+" = ");
				for(int j=1;j<=2;j++) {
					System.out.print("["+i+"]"+" "+a+" + "+b+" = ");
					int user = scan.nextInt();
					if (sum==user) {
						System.out.println("딩동댕");
						count++;
						break; // for j
					}else {
						System.out.println("틀렸다");
						if(j==2) {
							System.out.println("정답은 " + sum);
						}
					}
				}//for j
//				int user = scan.nextInt();
//				if(sum!=user) {
//					System.out.println("틀렸다");
//					System.out.print("["+i+"]"+" "+a+" + "+b+" = ");
//					user = scan.nextInt();
//					if(sum!=user) {
//						System.out.println("틀렸다 정답은 " + sum);
//					}else {
//						System.out.println("딩동댕");
//						count++;
//					}
//				}else {
//					System.out.println("딩동댕");
//					count++;
//				}
			}//for i
			System.out.println("당신은 총 "+count+"문제를 맞춰서 점수 "+count*20+"입니다" );
			
			while(true) {
				System.out.print("또 할래?(Y/N)");
				String ques = scan.next();
				if(ques.equals("N")||ques.equals("n")) break LOOP;
				else if(ques.equals("Y")||ques.equals("y")) break;
				else continue;
			}//while
		}//while
		System.out.println("프로그램 종료");
		}
	}


/*
 * a,b,user 
 * [문제] 덧셈 계산 (for, while, 다중 for) - 10 ~ 99 사이의 난수를 2개 발생하여 합을 구하는
 * 프로그램 - 5문제를 제공한다. - 1문제당 점수 20점씩 처리한다. - 틀리면 1번 더 기회를 주고, 2번 다 틀리면 답을 알려준다.
 * 
 * [실행결과] [1] 25 + 36 = 50 틀렸다 [1] 25 + 36 = 59 틀렸다 정답은 xx
 * 
 * [2] 10 + 25 = 35 딩동뎅
 * 
 * [5] 78 + 95 = 89 틀렸다 [5] 78 + 95 = 173 딩동뎅
 * 
 * 당신은 총 x 문제를 맞추어서 점수 xx점 입니다.
 * 
 * 또 할래(Y/N) :y. n 이외의 값 안받고 또 할래(Y/N) : 프로그램을 종료합니다
 */
