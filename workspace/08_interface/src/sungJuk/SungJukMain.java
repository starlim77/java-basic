package sungJuk;

public class SungJukMain {

	public static void main(String[] args) {

		SungJukService sungJukService = new SungJukService();
		sungJukService.menu();
		System.out.println("프로그램 종료");
		
	}

}
/*
Package   : sungJuk
Interface : SungJuk.java
추상메소드   : public void execute(~~~);

Class     : SungJukDTO.java - 1인분
            SungJukInsert.java
            SungJukList.java
            SungJukUpdate.java
            SungJukService.java - menu()
            SungJukMain.java

[조건]
1. SungJukDTO.java
필드 : 번호(중복X), 이름, 국어, 영어, 수학, 총점, 평균
메소드 : 생성자
       setter / getter

2. SungJukInsert.java
- 번호, 이름, 국어, 영어, 수학를 입력하여 총점과 평균을 계산한다.

번호 입력 : 
이름 입력 : 
국어 입력 : 
영어 입력 : 
수학 입력 : 

입력되었습니다

3. SungJukList.java
- ArrayList에 저장된 모든 데이터를 출력한다.
 
번호   이름   국어   영어   수학    총점   평균

4. SungJukUpdate.java
- 없는 번호가 입력되면 "잘못된 번호 입니다." 라고 출력한다.
- 있는 번호가 입력되면 번호에 해당하는 데이틀 출력 후 수정한다.
번호 입력 : 
잘못된 번호 입니다.

또는 

번호   이름   국어   영어   수학    총점   평균

수정 할 이름 입력 : 
수정 할 국어 입력 : 
수정 할 영어 입력 : 
수정 할 수학 입력 : 

수정하였습니다.

*/