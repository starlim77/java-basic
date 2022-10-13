package inheritance;

class AA{
	public int a = 3;
	public void disp() {
		a += 5;
		System.out.println("AA : " + a + " ");
	}
}
//------------
class BB extends AA{
	public int a = 8;
	public void disp() {
		this.a += 5;
		System.out.println("BB : " + a + " ");
	}
}

//---
public class TestMain {

	public static void main(String[] args) {
		
		BB aa = new BB();
		aa.disp();// BB : 13
		System.out.println("aa : "+aa.a);
		System.out.println();
	
		AA bb = new BB();// 부모 = 자식
		bb.disp();//BB : 13
		System.out.println("bb : "+bb.a);//3
		System.out.println();
		
		BB dd =(BB)bb; // 자식 = (자식)부모
		dd.disp(); //BB : 18
		System.out.println("dd : "+ dd.a);//18
		System.out.println();
		
		AA cc =new AA(); 
		cc.disp();//AA : 8
		System.out.println("cc : "+ cc.a);//8
	}
}
