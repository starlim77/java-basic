package inheritance;

enum Color{
	RED,GREEN,BLUE
}

class Final{
	public final String FRUIT = "사과"; // final은 public을 많이 사용한다. 접근이 가능해서 어차피 값을 변경하지 못하기 때문.
	public final String FRUIT2;
	
	public static final String ANIMAL = "사자"; // final은 보통 static을 사용한다. new 하지 않고,
	public static final String ANIMAL2;
	
//	public static final int RED=0;
//	public static final int GREEN=1;
//	public static final int BLUE=2;
	
	
	static {//static 초기화 영역
		ANIMAL2 = "기린";		
	}
	public Final() {
		FRUIT2 = "딸기"; //객체의 초기화는 생성자에서.
	}
}
//-------------------
public class FinalMain {

	public static void main(String[] args) {
		final int AGE = 10;
//		AGE++; -error 상수 값을 변경할 수 없다.
		System.out.println("AGE = " + AGE);

		final int AGE2;
		AGE2 = 20;
//		AGE2 = 30; -error
		System.out.println("AGE2 = " + AGE2);
		
		Final f = new Final();
		System.out.println("FRUIT = "+f.FRUIT);
		System.out.println("FRUIT2 = "+f.FRUIT2);
		System.out.println();
		System.out.println("ANIMAL = "+Final.ANIMAL);
		System.out.println("ANIMAL = "+Final.ANIMAL2);
		System.out.println();
		
//		System.out.println("빨강 = "+ Color.RED);
//		System.out.println("빨강 = "+ Color.RED.ordinal());
		
		for(Color data : Color.values()) {
			System.out.print(data+"\t");
			System.out.print(data.ordinal());
			System.out.println();
		}
		
	}

}
