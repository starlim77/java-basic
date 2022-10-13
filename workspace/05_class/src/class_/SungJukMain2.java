package class_;

public class SungJukMain2 {

	public static void main(String[] args) {
		
//		int a=10; // 정수형 변수;
//		int b=20;
//		int c=30;
//		
//		int[] ar = {10,20,30};
//		ar[0] = 10;
//		//--------------------------
//		SungJuk s = new SungJuk();  //객체
//		SungJuk bb = new SungJuk();
//		SungJuk cc = new SungJuk();
		
		SungJuk[] ar = new SungJuk[3]; //객체 배열
		ar[0] = new SungJuk();
		ar[1] = new SungJuk();
		ar[2] = new SungJuk();
		
		ar[0].setData("홍길동", 90, 95, 100);
		ar[1].setData("프로도", 30, 50, 90);	
		ar[2].setData("죠르디", 75, 80, 48);
		
		for(int i=0;i<ar.length;i++) {
			ar[i].calc();
			System.out.println("---------------------------------------------------");
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
			System.out.println("---------------------------------------------------");
			System.out.println(ar[i].getName()+"\t"
								+ar[i].getKor()+"\t"
								+ar[i].getEng()+"\t"
								+ar[i].getMath()+"\t"
								+ar[i].getTot()+"\t"
								+String.format("%.2f",ar[i].getAvg())+"\t"
								+ar[i].getGrade());
		}//for i
		System.out.println();
		for(SungJuk s:ar) {
			s.calc();
			System.out.println("---------------------------------------------------");
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
			System.out.println("---------------------------------------------------");
			System.out.println(s.getName()+"\t"
								+s.getKor()+"\t"
								+s.getEng()+"\t"
								+s.getMath()+"\t"
								+s.getTot()+"\t"
								+String.format("%.2f",s.getAvg())+"\t"
								+s.getGrade());
			
		}
			
	}

}
