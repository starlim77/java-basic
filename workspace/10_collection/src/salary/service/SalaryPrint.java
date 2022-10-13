package salary.service;

import java.util.ArrayList;


import salary.bean.SalaryDTO;

public class SalaryPrint implements Salary {

	@Override
	public void execute(ArrayList<SalaryDTO> arrayList) {

		System.out.println("사원번호\t이름\t직급\t기본급\t수당\t세율\t월급");
		System.out.println("---------------------------------------------");
		for(SalaryDTO salaryDTO:arrayList) System.out.println(salaryDTO);
	}

}
