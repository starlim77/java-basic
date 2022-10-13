package salary.bean;

public class SalaryDTO implements Comparable<SalaryDTO>{

	private int employeeNum, basePay, extraPay;
	private double taxRate, monthlyPay;
	private String name, position;
	
	public SalaryDTO(int employeeNum, String name, String position, int basePay, int extraPay) {
		this.employeeNum = employeeNum;
		this.basePay = basePay;
		this.extraPay = extraPay;
		this.name = name;
		this.position = position;
	}
	public void setUpdateData(String position, int basePay, int extraPay) {
		this.position = position;
		this.basePay = basePay;
		this.extraPay = extraPay;
	}
	
	public int getEmployeeNum() {
		return employeeNum;
	}

	public int getBasePay() {
		return basePay;
	}

	public int getExtraPay() {
		return extraPay;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public double getMonthlyPay() {
		return monthlyPay;
	}

	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}
	
	public void calc() {
		if(basePay+extraPay>4000000) {
			taxRate=0.03;
		}//if
		else if(basePay+extraPay<=2000000) {
			taxRate=0.01;
		}
		else taxRate=0.02;
		
		monthlyPay=basePay+extraPay-(basePay-extraPay)*taxRate;
	}
	
	@Override
	public String toString() {
		return employeeNum+"\t"
			  +name+"\t"
			  +position+"\t"
			  +basePay+"\t"
			  +extraPay+"\t"
			  +taxRate+"\t"
			  +monthlyPay;
	}
	
	@Override
	public int compareTo(SalaryDTO arrayList) {
		int re = this.name.compareTo(arrayList.name);
		return re;
	}
	
	
}
