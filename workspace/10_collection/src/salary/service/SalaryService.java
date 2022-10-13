package salary.service;

import java.util.ArrayList;
import java.util.Scanner;

import salary.bean.SalaryDTO;

public class SalaryService {

	public void menu() {
		
		ArrayList<SalaryDTO> arrayList = new ArrayList<SalaryDTO>();
		while(true) {
			
			System.out.println("---------------------------------------");
			System.out.println("1.등록");
			System.out.println("2.출력");
			System.out.println("3.수정");
			System.out.println("4.검색");
			System.out.println("5.삭제");
			System.out.println("6.정렬");
			System.out.println("7.종료");
			System.out.println("---------------------------------------");
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("메뉴 번호 입력(1~7) : ");
			int menuNum = scanner.nextInt();
			
			
			Salary salary=null;
			if(menuNum==7) break;
			else if(menuNum==1) salary = new SalaryWrite();
			else if(menuNum==2) salary = new SalaryPrint();
			else if(menuNum==3) salary = new SalaryUpdate();
			else if(menuNum==4)	salary = new SalarySearch();
			else if(menuNum==5) salary = new SalaryDelete();
			else if(menuNum==6)	salary = new SalarySort();
			else {
				System.out.println("올바른 번호 입력");
				continue;
			}
			salary.execute(arrayList);
			
		}
		
	}
	
}
