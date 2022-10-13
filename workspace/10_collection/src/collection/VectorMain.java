package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		System.out.println("벡터 크기 = " + v.size()); //0 , 내용물이 없으므로.
		System.out.println("벡터 용량 = " + v.capacity()); // 책꽂이처럼 일정 공간이 정해져 있음. 벡터의 용량은 항목 10개.  기본용량 10, 공간이 모자라면 한번에 10개씩 증가함
		System.out.println();
		
		System.out.println("항목 추가");
		for(int i=1; i<=10; i++) {
			v.add(i + "");
			System.out.print(v.get(i-1)+" ");
		}
		System.out.println();
		System.out.println("벡터 크기 = " + v.size()); // 10 
		System.out.println("벡터 용량 = " + v.capacity());// 10
		System.out.println("항목 1개 추가");
		
		v.addElement(5+"");// 중복 허용
		System.out.println("벡터 크기 = " + v.size()); // 11 
		System.out.println("벡터 용량 = " + v.capacity());// 20
		for(int i=1; i<=11; i++) {
			System.out.print(v.get(i-1)+" ");
		}
		System.out.println();
		
		System.out.println("마지막 항목 삭제");
//		v.remove("5");// 앞에 있는 5가 삭제된다
		v.remove(10);
		for(int i=1; i<=10; i++) {
			System.out.print(v.get(i-1)+" ");
		}
		
		Iterator it = v.iterator();// 생성 - 메소드 이용
		while(it.hasNext()) {// it.hasNext() - 항목이 있으면 true 없으면 false
			System.out.print(it.next()); // 항목을 꺼내서 버퍼에 저장하고 다음 위치로 이동
		}//while
		
		
	}

}
