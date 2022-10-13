package constructor;

import java.util.Scanner;

public class Exam {
	
	Scanner scan = new Scanner(System.in);
	
	private String name;
	private String dap;
	private char[] ox = new char[5];
	private int score;
	private final String JUNG = "11111"; //상수화
	
	
	public Exam() {
		System.out.print("이름 입력 : ");
		name = scan.next();
		System.out.print("답 입력 : ");
		dap = scan.next();
	}
	
	public void compare(){
		for(int i=0;i<5;i++) {
			if(dap.charAt(i)==JUNG.charAt(i)) {
				score+=20;
				ox[i] = 'O';
			}else ox[i] = 'X';
		}
	}
	public String getName(){
		return name;
	}
	public char[] getOx(){
		return ox;
	}
	public int getScore (){
		return score;
	}
	
	
	
	
}
