package collection;

import java.util.LinkedList;
import static java.lang.System.out;

public class QueueMain {// FIFO 구조 first in first out,   명령이 들어오면 순서대로 처리한다.

	public static void main(String[] args) {
		
		String[] item = {"소나타","렉스톤","재규어"};
		LinkedList<String> q = new LinkedList<String>();
		
		for(String n : item)
			q.offer(n); //요소 추가
		
		out.println("q의 크기:"+q.size()+"\n");
		String data="";
		
		while((data=q.poll()) != null) {
			out.println(data+"삭제!");
			out.println("q의 크기:"+q.size()+"\n");	
		
		}
	}

}
