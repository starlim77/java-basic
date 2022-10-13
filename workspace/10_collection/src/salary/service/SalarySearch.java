package salary.service;

import java.util.ArrayList;
import java.util.Scanner;

import salary.bean.SalaryDTO;

public class SalarySearch implements Salary {

	@Override
	public void execute(ArrayList<SalaryDTO> arrayList) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("검색할 사원의 이름을 입력 : ");
		String name = scanner.next();
		int sw=0;
		for(SalaryDTO salaryDTO : arrayList) {
			if(salaryDTO.getName().equals(name)) {
				System.out.println(salaryDTO);
				sw=1;
			}//if
		}//for
		if(sw==0) System.out.println("해당 이름의 사원이 존재하지 않습니다");
		
	}

}
