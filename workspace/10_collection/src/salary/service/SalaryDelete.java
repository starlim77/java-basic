package salary.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import salary.bean.SalaryDTO;

public class SalaryDelete implements Salary {

	@Override
	public void execute(ArrayList<SalaryDTO> arrayList) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("삭제할 사원번호 입력 : ");
		int employeeNum = scanner.nextInt();
		int sw=0;
		Iterator<SalaryDTO> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			if(iterator.next().getEmployeeNum()==employeeNum){
				iterator.remove();
				sw=1;
				System.out.println("삭제 완료되었습니다");
				break;
			}//if
		}//while
		if(sw==0) System.out.println("해당 번호의 사원이 존재하지 않습니다");
	}

}
