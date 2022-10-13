package salary.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import salary.bean.SalaryDTO;

public class SalarySort implements Salary {

	@Override
	public void execute(ArrayList<SalaryDTO> arrayList) {
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("--------------------");
			System.out.println("정렬 방법을 선택하세요");
			System.out.println("1. 이름 오름차순");
			System.out.println("2. 월급 내림차순");
			System.out.println("3. 돌아가기");
			System.out.println("--------------------");
			System.out.print("정렬 방법 입력 : ");
			int sortNum = scanner.nextInt();
			
			if(sortNum==3) break;
			else if(sortNum==1) {
				Collections.sort(arrayList);
				System.out.println("이름 오름차순 정렬완료");
			}
			else if(sortNum==2) {
				Comparator<SalaryDTO> comparator = new Comparator<SalaryDTO>() {
					@Override
					public int compare(SalaryDTO s1, SalaryDTO s2) {
						return s1.getMonthlyPay()< s2.getMonthlyPay() ? 1 : -1;
					}
				};
				Collections.sort(arrayList, comparator);
				System.out.println("월급 내림차순 정렬완료");
				
			}
			
		}
		
	}

}
