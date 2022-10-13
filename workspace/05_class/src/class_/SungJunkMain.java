package class_;

public class SungJunkMain {

	public static void main(String[] args) {
		
		SungJuk s = new SungJuk(); // heap영역에 메모리가 설정된다.
		
		s.setData("홍길동", 90, 95, 100);
		s.calc();
		
		System.out.println("---------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("---------------------------------------------------");
		System.out.println(s.getName()+"\t"+s.getKor()+"\t"+s.getEng()+"\t"+s.getMath()+"\t"+s.getTot()+"\t"+s.getAvg()+"\t"+s.getGrade());
		
		SungJuk bb = new SungJuk();
		bb.setData("프로도", 30, 50, 90);
		bb.calc();
		
		System.out.println("---------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("---------------------------------------------------");
		System.out.println(bb.getName()+"\t"+bb.getKor()+"\t"+bb.getEng()+"\t"+bb.getMath()+"\t"+bb.getTot()+"\t"+bb.getAvg()+"\t"+bb.getGrade());
		
		SungJuk cc = new SungJuk();
		cc.setData("죠르디", 75, 80, 48);
		cc.calc();
		
		System.out.println("---------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("---------------------------------------------------");
		System.out.println(cc.getName()+"\t"+cc.getKor()+"\t"+cc.getEng()+"\t"+cc.getMath()+"\t"+cc.getTot()+"\t"+cc.getAvg()+"\t"+cc.getGrade());
		
		
	}

}
