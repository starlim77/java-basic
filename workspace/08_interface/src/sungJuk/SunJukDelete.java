package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class SunJukDelete implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("삭제할 이름을 입력 : ");
		String name = scanner.next();
		int sw=0;
		Iterator<SungJukDTO> iterator = list.iterator(); //Iterator iterator = list.iterator(); 
		while(iterator.hasNext()) {
			SungJukDTO sungJukDTO= iterator.next(); // SungJukDTO sungJukDTO= (SungJukDTO)iterator.next();
//			
//			iterator.next().getName() , iterator.getClass().getName() ;
			if(sungJukDTO.getName().equals(name)) {
				sw=1;
				iterator.remove(); //list에서 항목을 삭제하면 index가 다시 부여된다
			}
		}
//		for(int i=0; i<list.size();i++) {
//			if(list.get(i).getName().equals(name)) {
//				list.remove(i); 
//				i--;
//				sw=1;
//			}
//		}
		
		if (sw==1) System.err.println("모든 데이터를 삭제 했습니다");
		else if(sw==0) System.out.println("삭제 할 이름이 없습니다");
	}

}
		
		
//		for(SungJukDTO sungJukDTO:list) {
//			if(sungJukDTO.getName().equals(name)) {
//				sw=1;
//				iterator.next();
//				iterator.remove();
//				sungJukDTO=null;
//			}
//			if(sungJukDTO.getName().equals(name)) {
//				sw=1;
//				iterator.next();
//				iterator.remove();
//				System.out.println("삭제 완료");
//				System.out.println("ha");
//			}
////			while(iterator.hasNext()) {
////				if(iterator.getName();) {
////					
////				}
////			}
//			
////			if(list.get(i).getName().equals(name)) {
////				sw=1;
////				list.get(i)=null;
////				System.out.println("삭제 완료");
////			}
////			if(list.get(i).equals(name)) {
////				Iterator<SungJukDTO> interator = list.iterator();
////			}
////			
//			}
//		
//		
////		while(iterator.hasNext()) {
////			
//		}
		
		
		

