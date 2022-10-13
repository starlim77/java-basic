package sungJuk;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SungJukSort implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("---------------------------");
		System.out.println(" 1. 총점으로 내림차순");
		System.out.println(" 2. 이름으로 오름차순");
		System.out.println(" 3. 이전메뉴");
		System.out.print("번호입력 : ");
		int num = scanner.nextInt();
		
		if(num==1) Collections.sort(list);
		else if(num==2) {
			Comparator<SungJukDTO> comparator = new Comparator<SungJukDTO>() {
				@Override
				public int compare(SungJukDTO sungJukDTO1, SungJukDTO sungJukDTO2) {
					return sungJukDTO1.getName().compareTo(sungJukDTO2.getName());
//					return sungJukDTO1.getName().compareTo(sungJukDTO2.getName());
				}
			};
			Collections.sort(list, comparator);
		}
		else if(num==3) return;
		
	}

}
