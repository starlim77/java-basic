package class2;

class Fruit{
	private String pum;
	private int jan,feb,mar,tot;
	
	private static int sumJan,sumFeb,sumMar; //static
	
	public Fruit(String pum,int jan,int feb,int mar) {
		this.pum = pum;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
	}
	public void calcTot() {
		tot = jan + feb + mar;
		sumJan += jan;
		sumFeb += feb;
		sumMar += mar;
	}
	public void display() {
		System.out.println(pum+"\t"+jan+"\t"+feb+"\t"+mar+"\t"+tot);
	}
	public static void output() {
		System.out.print("\t");
		System.out.println(sumJan+"\t"+sumFeb+"\t"+sumMar);
	}
		
}
public class FruitMain {

	public static void main(String[] args) {
		
		Fruit[] fruit = new Fruit[3];
		fruit[0] = new Fruit("사과", 100, 80, 75);
		fruit[1] = new Fruit("포도", 30, 25, 10);
		fruit[2] = new Fruit("딸기", 25, 30, 90);
		
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		for(int i=0; i<fruit.length;i++) {
			fruit[i].calcTot();
			fruit[i].display();
		}
		Fruit.output();
	}

}
/*
과일 판매량 구하기
월별 매출합계도 구하시오

클래스 : Fruit
pum, jan, feb, mar, tot
sumJan, sumFeb, sumMar

생성자
calcTot()
display()
output() - static


클래스 : FruitMain


[실행결과]
---------------------------------
PUM      JAN   FEB   MAR      TOT
---------------------------------
사과    100    80    75     255
포도     30    25    10     xxx
딸기     25    30    90     xxx
---------------------------------
        xxx   xxx   xxx            output()로 처리
*/