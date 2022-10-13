package inheritance;

class Test extends Object{// 자바의 모든 클래스는 Object로 부터 상속받는다
		
	@Override
	public String toString() {
		return getClass()+"@haha";
	}
}

// -----
public class ObjectMain {

	public static void main(String[] args) {
		
		Test t = new Test();
		System.out.println("객체 t = "+t);
		System.out.println("객체 t = "+t.toString()); //Object를 상속 하므로 오브젝트의 메소드 사용가능. '
		System.out.println("객체 t = "+t.hashCode());
		
		String str = "apple";
		System.out.println("객체 str = "+ str);
		System.out.println("객체 str = "+ str.toString());
		System.out.println("객체 str = "+ str.hashCode());
		
		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println("aa==bb : "+(aa==bb));// 주소 - false
		System.out.println("aa.equals(bb) : " + aa.equals(bb));//문자열 - true
																//override되어서 String의 equals는 문자열을 비교하게 된다.
		
		Object cc  = new Object();
		Object dd = new Object();
		System.out.println("cc==dd : "+(cc==dd)); // 주소 - false
		System.out.println("cc.equals(dd) : " + cc.equals(dd));// 주소 - false
		
		Object ee  = new String(); // 다형성.. override
		Object ff = new String();
		System.out.println("ee==ff : "+(ee==ff)); // 주소 - false
		System.out.println("ee.equals(ff) : " + ee.equals(ff));//문자열 - true
	}

}
/*
class Object{
	public boolean equals(Object)	참조값 비교
	public String toString()	클@16진수
	public int hashCode()		10진수
}
class Test extends Object{
	public String toString()   바보
}
class String extends Object{
	public int hashCode()
	
	public String toString()	문자열
	public boolean equals()		문자열 비교



*/
