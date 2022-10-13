package sungJuk;

import java.util.Collection;

public class SungJukDTO implements Comparable<SungJukDTO>{
	
	private String name;
	private int num,kor,eng,math,tot;
	private double avg;
	
	public SungJukDTO(int num, String name, int kor, int eng, int math) {
		this.num=num;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		tot=kor+eng+math;
		avg=tot/3.;
	}
	public void setData(String name, int kor, int eng, int math) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		tot=kor+eng+math;
		avg=tot/3.;
	}
	public String getName() {
		return name;
	}
	public int getNum() {
		return num;
	}
	public int getkor() {
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
	
	@Override
	public String toString() {
//		return super.toString();
		return num +"\t"+ name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+avg;
	}
	@Override
	public int compareTo(SungJukDTO list) {
		if(this.tot<list.tot) return 1;
		else if(this.tot>list.tot) return -1;
		else return 0;
	}
	}
	
	

