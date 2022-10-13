package class2;

import java.util.Scanner;


public class StringMain2 {
	
	public StringMain2(){
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			int count = 0;
			
			System.out.print("문자열 입력 : ");
			String munja = scanner.next();
			System.out.print("현재 문자열 입력 : ");
			String presentMunja = scanner.next();
			System.out.print("바꿀 문자열 입력 : ");
			String changeMunja = scanner.next();
			
			
			if(munja.length()<presentMunja.length()) System.out.println("입력한 문자열의 크기가 작습니다");
			else {
				if(munja.indexOf(presentMunja)>=0) {
					munja = munja.toLowerCase();
					presentMunja = presentMunja.toLowerCase();
					System.out.println(munja.replace(presentMunja, changeMunja));
					for(int i=0; i<munja.length(); i++) {
						if(munja.indexOf(presentMunja,i)>=0) {
							i = munja.indexOf(presentMunja,i)+(presentMunja.length()-1);
							count++;
						}
					}
					System.out.println(count+"번 치환");
				}else {
					System.out.println("치환 할 수 없습니다");
				}
				System.out.println();
				
				}
			}
	}
	public static void main(String[] args) {
		
		StringMain2 stringMain2 = new StringMain2();
	}

}
/*
치환하는 프로그램을 작성하시오 - indexOf(), replace()   // indexOf(,) 인자 두 개 짜리 사용
String 클래스의 메소드를 이용하시오
대소문자 상관없이 개수를 계산하시오

[실행결과]
문자열 입력 : aabba   while 문 사용
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aAbbA    // 소문자나 대문자로 일괄 치환 후 검색 하면됨
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aabbaa
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbbdd
2번 치환

문자열 입력 : AAccaabbaaaaatt
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddccddbbddddatt
4개 치환

문자열 입력 : aabb
현재 문자열 입력 : aaaaa
바꿀 문자열 입력 : ddddd
입력한 문자열의 크기가 작습니다
치환 할 수 없습니다

indexOf()
replace()
*/