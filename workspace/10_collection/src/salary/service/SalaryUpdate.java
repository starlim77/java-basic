package salary.service;

import java.util.ArrayList;
import java.util.Scanner;

import salary.bean.SalaryDTO;

public class SalaryUpdate implements Salary {

	@Override
	public void execute(ArrayList<SalaryDTO> arrayList) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("직원 번호를 입력하세요 : ");
		int employeeNum = scanner.nextInt();
		int sw=0;
		for(SalaryDTO salaryDTO:arrayList) {
			if(salaryDTO.getEmployeeNum()==employeeNum) {
				System.out.println(salaryDTO);
				System.out.print("수정할 직급 입력 : ");
				String position = scanner.next();
				System.out.print("수정할 기본급 입력 : ");
				int basePay = scanner.nextInt();
				System.out.print("수정할 수당 입력 : ");
				int extraPay = scanner.nextInt();
				salaryDTO.setUpdateData(position,basePay,extraPay);
				salaryDTO.calc();
				sw=1;
				System.out.println("수정이 완료되었습니다");
			}//if
		}//for
		if(sw==0) System.out.println("일치하는 사원이 없습니다");
		
	}

}
