package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukUpdate implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("번호 입력 : ");
		int num = scanner.nextInt();
		int count=0;
		int sw=0;
		for(SungJukDTO tem : list) {
			if(tem.getNum()==num) {
				sw=1;
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println(tem);
				System.out.print("수정 할 이름 입력 : ");
				String name = scanner.next();
				System.out.print("수정 할 국어 입력 : ");
				int kor = scanner.nextInt();
				System.out.print("수정 할 영어 입력 : ");
				int eng = scanner.nextInt();
				System.out.print("수정 할 수학 입력 : ");
				int math = scanner.nextInt();
				tem.setData(name, kor, eng, math);
				System.out.println("수정하였습니다");
				
				break;
			}//if
//			count++;
		}//for
		if(sw==0) System.out.println("잘못된 번호입니다");
		if(count==list.size()) {
			
		}
	}

	
}
