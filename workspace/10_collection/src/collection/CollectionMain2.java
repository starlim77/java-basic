package collection;

import java.util.ArrayList;


public class CollectionMain2 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>(); //generic
		list.add("호랑이");
		list.add("사자");
		list.add("호랑이"); //중복허용, 순서대로 들어감.
//		list.add(25);
//		list.add(43.8);
		list.add("기린");
		list.add("코끼리");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		for(String str:list) {
			System.out.println(str);
		}
	}

}
