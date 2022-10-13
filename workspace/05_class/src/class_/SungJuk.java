package class_;

public class SungJuk {
	
	private String name;  //캡슐
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private char grade;
	
	public void setData(String a, int b, int c, int d) {
		name = a;
		kor = b;
		eng=c;
		math=d;
	}
	public void calc() {
		tot=kor+eng+math;
		avg=tot/3.;
		if(avg>=90) grade = 'A';
		else if(avg>=80) grade = 'B';
		else if(avg>=70) grade ='C';
		else if(avg>=60) grade = 'D';
		else grade = 'F';
	}
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public int getTot() {
		return tot;
	}
	public double getAvg() {
		return avg;
	}
	public char getGrade() {
		return grade;
	}
	
}
