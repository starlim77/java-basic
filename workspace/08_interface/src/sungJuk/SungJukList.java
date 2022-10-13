package sungJuk;

import java.util.ArrayList;

public class SungJukList implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> list) {
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for(SungJukDTO tem : list) {// SungJukDTO sungJukDTO : list
//			System.out.println(tem.getNum()+"\t"   //sungJukDTO.getNum()
//							  +tem.getName()+"\t"
//							  +tem.getkor()+"\t"
//							  +tem.getEng()+"\t"
//							  +tem.getMath()+"\t"
//							  +tem.getTot()+"\t"
//							  +tem.getAvg());
			System.out.println(tem);
		}
		
		
		
		
		
		
	}

}
