package sungJuk;

import java.util.ArrayList;

import java.util.Scanner;

public class SungJukService {
	
	private ArrayList<SungJukDTO> list = new ArrayList<SungJukDTO>();
	
	public void menu() {
		
		while(true) {
			
			System.out.println("******************");
			System.out.println(" 1.입력");
			System.out.println(" 2.출력");
			System.out.println(" 3.수정");
			System.out.println(" 4.삭제");
			System.out.println(" 5.정렬");
			System.out.println(" 6.종료");
			System.out.println("******************");
			
			Scanner scanner = new Scanner(System.in);
			int num=0;
			System.out.print("번호 입력 : ");
			num = scanner.nextInt();
			
			SungJuk sungJuk;
			if(num==6) break;
//			System.exit(0);  -> 강제 종료
			
			else if(num==1) {
				sungJuk = new SungJukInsert();
//				sungJuk.execute(list);
			}
			else if(num==2){
				sungJuk = new SungJukList();
//				sungJuk.execute(list);
			}
			else if (num==3){
				sungJuk = new SungJukUpdate();
//				sungJuk.execute(list);
			}
			else if(num==5) {
				sungJuk = new SungJukSort();
			}
			else if(num==4) {
				sungJuk = new SunJukDelete();
			}
			else {
				System.out.println("1~6중에 선택하세요");
				continue;
			}
			sungJuk.execute(list);
			
		}//while
		
		
	}
}
