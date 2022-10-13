package array;

import java.util.Scanner;

//public class Array04 {
//
//	public static void main(String[] args) {
//		
//		Scanner scan = new Scanner(System.in);
//		
//		int[] park = new int[5];  // boolean[] ar = new boolean[5];
//		
//		while(true) {
//			System.out.println("**************");
//			System.out.println("주차장 관리 프로그램");
//			System.out.println(" 1.입차");
//			System.out.println(" 2.출차");
//			System.out.println(" 3.리스트");
//			System.out.println(" 4.종료");
//			System.out.println("**************");
//			
//			System.out.print("메뉴 : ");
//			int menu = scan.nextInt();
//			
////			if(menu<1 || menu>4){
////				System.out.println("1~4 번까지만 입력하세요");
////				continue;
////			}
//
//			if(menu==1) {
//				System.out.print("위치 입력 : ");
//				int position = scan.nextInt();
//				if(park[position-1]==0) {
//					park[position-1]=1;
//					System.out.println(position+"위치에 입차되었습니다");
//				}else System.out.println(position+"위치에 이미 입차되어있습니다");
//			}
//			else if(menu==2) {
//				System.out.print("위치 입력 : ");
//				int position = scan.nextInt();
//				if(park[position-1]==1) {
//					park[position-1]=0;
//					System.out.println(position+"위치에 출차되었습니다");
//				}else System.out.println(position+"위치에 주차 되어있지 않습니다");
//			}
//			else if(menu==3) {
//				int listnum = 1;
//				for(int list:park){  //boolean list
//					boolean use;
//					if(list==0) use = false;
//					else use=true;
//					System.out.println(listnum+"위치 : "+ use);
//					listnum++;
//				}
//			}
//			else if(menu==4) {
//				break;
//			}
//		}
//		System.out.println("프로그램 종료");
//		
//	}
//
//}
public class Array04 {

	   public static void main(String[] args) {
	      Scanner scan = new Scanner(System.in);
	      boolean[] ar = new boolean[5];
	      int num;
	      
	      while(true) {
	         System.out.println();
	         System.out.println("   주차관리시스템");
	         System.out.println("****************");
	         System.out.println("   1. 입차");
	         System.out.println("   2. 출차");
	         System.out.println("   3. 리스트");
	         System.out.println("   4. 종료");
	         System.out.println("****************");
	         System.out.print  ("    메뉴 : ");
	         num = scan.nextInt();
	         if(num == 4) break;
	         if(num<1 || num>4) {
	            System.out.println("1 ~ 4번까지만 입력하세요");
	            continue;
	         }
	         
	         if(num == 1) {
	            System.out.print("위치 입력 : ");
	            int position = scan.nextInt();
	            
	            if( ar[position-1] )
	               System.out.println("이미 주차되어있습니다");
	            else {
	               ar[position-1] = true;
	               System.out.println(position + "위치에 입차");
	            }
	            
	         }else if(num == 2) {
	            System.out.print("위치 입력 : ");
	            int position = scan.nextInt();
	            
	            if(ar[position-1]) {
	               ar[position-1] = false;
	               System.out.println(position + "위치에 출차");
	            }else
	               System.out.println("주차되어 있지않습니다");
	            
	         }else if(num ==3) {
	            for(int i=0; i<ar.length; i++) {
	               System.out.println( (i+1)+"위치 : " + ar[i]);
	            }//for
	         }
	      }//while
	      
	      System.out.println("프로그램을 종료합니다.");

	   }

	}

/*
주차장 관리 프로그램
**************
   1. 입차      
   2. 출차      
   3. 리스트     
   4. 종료
**************
  메뉴 : 

1번인 경우
위치 입력 : 3
3위치에 입차 / 이미 주차되어있습니다

2번인 경우
위치 입력 : 4
4위치에 출차 / 주차되어 있지않습니다

3번인 경우
1위치 : true
2위치 : false
3위치 : true
4위치 : false
5위치 : false
*/