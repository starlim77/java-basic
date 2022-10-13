package abstract_;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarMain {
	
	private int year, month, days, firstDay;

	public CalendarMain() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("년도 입력 : ");
		year = scanner.nextInt();
		System.out.print("월 입력 : ");
		month = scanner.nextInt();
	}
	public void calc() {
		Calendar cal = Calendar.getInstance();// 시스템 시간으로 설정됨
		cal.set(year,month-1,1); //시스템 시간을 원하는 년,월,일 값으로 설정. 일은 1일로.
		days = cal.getActualMaximum(Calendar.DATE);// 해당 월의 날짜 수
//		days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		firstDay = cal.get(Calendar.DAY_OF_WEEK); // 해당 일의  요일
//		System.out.println(days);
//		System.out.println(firstDay);
	}
	public void display() {
		System.out.println();
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i=1; i<firstDay; i++) {
			System.out.print("\t");
		}
		for(int i=1; i<=days; i++) {
			System.out.print(i + "\t");
			if(firstDay%7==0) System.out.println();
			firstDay++;
		}
	}
	
	public static void main(String[] args) {
		
		CalendarMain calendarMain = new CalendarMain();
		calendarMain.calc();
		calendarMain.display();
		
		
	}

}
/*
[문제] 만년달력
- 년도, 월을 입력하여 달력을 작성하시오
- 기본생성자 : 입력
- 메소드 : calc() -> 매달 1일의 요일이 무엇인지? (Calendar에 메소드 준비)
                -> 매달 마지막이 28, 29, 30, 31 무엇인지? (Calendar에 메소드 준비)
         display() 출력

[실행결과]
년도 입력 : 2002
월 입력 : 10   

일   월   화   수   목   금   토
      1   2   3   4   5
6   7   8   9   10   11   12
13   14   15   16   17   18   19
20   21   22   23   24   25   26
27   28   29   30   31
 */