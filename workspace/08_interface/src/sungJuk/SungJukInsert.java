package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukInsert implements SungJuk {
	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		
		Scanner scanner = new Scanner(System.in);
		
		LOOP : while(true) {
			System.out.print("학생 번호 입력 : ");
			int num = scanner.nextInt();
			for(SungJukDTO tem : list) {
				if(tem.getNum()==num) {
					System.out.println("이미 존재하는 번호입니다. 다른 번호를 입력해주세요");
					continue LOOP;
				}
			}
			System.out.print("이름 입력 : ");
			String name = scanner.next();
			System.out.print("국어 입력 : ");
			int kor = scanner.nextInt();
			System.out.print("영어 입력 : ");
			int eng = scanner.nextInt();
			System.out.print("수학 입력 : ");
			int math = scanner.nextInt();
			SungJukDTO sungJukDTO = new SungJukDTO(num, name, kor, eng, math);
			list.add(sungJukDTO);
			System.out.println("입력되었습니다");
			break;
		}
	}

}
