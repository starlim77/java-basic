package constructor;

public class ExamMain {

	public static void main(String[] args) {
		
		Exam e = new Exam();
		e.compare();
		System.out.println();
		System.out.println("이름\t1 2 3 4 5 \t점수");
		System.out.print(e.getName()+"\t");
		for(int i=0;i<5;i++) {
			System.out.print(e.getOx()[i]+" ");
		}
		System.out.print("\t"+e.getScore());
	}

}
