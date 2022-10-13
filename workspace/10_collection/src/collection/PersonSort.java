package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonSort {
	public static void main(String[] args) {
		String[] ar = {"orange", "apple", "banana", "pear","peach","applemango"};
		
		System.out.print("정렬 전 = ");
		for(String data:ar) {
			System.out.print(data+" ");
		}
		System.out.println();
		
		Arrays.sort(ar); // 알파벳 순서대로 정렬, 오름차순
		System.out.print("정렬 후 = ");
		for(String data:ar) {
			System.out.print(data+" ");
		}
		System.out.println();
		PersonDTO aa = new PersonDTO("홍길동",25);
		PersonDTO bb = new PersonDTO("프로도",40);
		PersonDTO cc = new PersonDTO("죠르디",30); 
		
		PersonDTO dd = new PersonDTO("3",25);
		PersonDTO ee = new PersonDTO("2",40);
		PersonDTO ff = new PersonDTO("1",30); 

		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		ArrayList<PersonDTO> list2 = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		list.add(dd);
		list.add(ee);
		list.add(ff);
		
		System.out.println("정렬 전 = ");
		for(PersonDTO personDTO:list) {
			System.out.println(personDTO);
		}
		
		System.out.println("나이로 오름차순");
		
		
		Collections.sort(list);
		System.out.println("정렬 후 = ");
		for(PersonDTO personDTO:list) {
			System.out.println(personDTO);
		}
		System.out.println("이름으로 내림차순");
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() {// 익명 Inner Class
			
			public int a =10;
			public int getA() {
				return a;
			}
			
			@Override
			public int compare(PersonDTO p1, PersonDTO p2) {
				return p1.getName().compareTo(p2.getName())*1; //
			}
		};// return compare method 1회 일해서 return 을 받았고.
		Collections.sort(list, com);  // return
		Collections.sort(list2, com); // return
		
		
		System.out.println("test");
//		System.out.println(com.getA);
		for(PersonDTO personDTO:list2) {
			System.out.println(personDTO);
		}
		
		
		for(PersonDTO personDTO:list) {
			System.out.println(personDTO);
		}
		
		String A = "haha";
		System.out.println(A.toString());
	}
}
