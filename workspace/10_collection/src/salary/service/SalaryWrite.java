package salary.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import salary.bean.SalaryDTO;

public class SalaryWrite implements Salary {

	@Override
	public void execute(ArrayList<SalaryDTO> arrayList) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("사원번호 입력 : ");
		int employeeNum = scanner.nextInt();
		for(SalaryDTO salaryDTO:arrayList) {
			if(salaryDTO.getEmployeeNum()==employeeNum) {
				System.out.println("중복되는 사원 번호 입니다. 다른 번호를 입력하세요");
				return;
			}
		}
		System.out.print("이름 입력 : ");
		String name = scanner.next();
		System.out.print("직급 입력 : ");
		String position = scanner.next();
		System.out.print("기본급 입력 : ");
		int basePay = scanner.nextInt();
		System.out.print("수당 입력 : ");
		int extraPay = scanner.nextInt();
		
		SalaryDTO salayDTO = new SalaryDTO(employeeNum,name,position,basePay,extraPay);
		salayDTO.calc();
		arrayList.add(salayDTO);
		System.out.println("입력 완료");
	}

}
