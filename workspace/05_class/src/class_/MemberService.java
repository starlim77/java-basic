package class_;

import java.util.Scanner;

public class MemberService {
	
	Scanner scan = new Scanner(System.in);

	private MemberDTO[] ar =  new MemberDTO[5]; //초기값 null  //필드는 끝. 메소드만 설정.
	
	
	int mcount=0;
	
	public void menu() {
	
		while(true) {
			System.out.println("********************");
			System.out.println(" 1.가입");
			System.out.println(" 2.출력");
			System.out.println(" 3.수정");
			System.out.println(" 4.탈퇴");
			System.out.println(" 5.끝내기");
			System.out.println("********************");
			System.out.print(" 번호 : ");
			
			int num = scan.nextInt();
			
			if(num==1) {
				insert();
			}
			else if(num==2) {
				list();
			}
			else if(num==3) {
				update();
			}
			else if(num==4) {
				delete();
			}
			else if(num==5) {
				break;
			}
			System.out.println();
		}//while	
	}
	
	public void insert() {
		if(mcount <= 4) {
		ar[mcount] = new MemberDTO();
		System.out.print("이름 입력 : ");
		ar[mcount].setName(scan.next());
		System.out.print("나이 입력 : ");
		ar[mcount].setAge(scan.nextInt());
		System.out.print("핸드폰 입력 : ");
		ar[mcount].setPhoneNum(scan.next());
		System.out.print("주소 입력 : ");
		ar[mcount].setAddress(scan.next());
		System.out.println("가입 완료되었습니다");
		System.out.println((4-mcount)+"자리 남았습니다");
		mcount++;
//		생성자를 이용해 한번에 값을 받아도 됨.
//		MemberDto memberDto = new MemberDto(name, age, PhoneNum, Address);
		}
		else System.out.println("5명의 정원이 꽉 찼습니다...");
		
		for(int i=0; i<ar.length;i++) {
			if(ar[i]==null) {
				break;
				//return : 메소드를 벗어나라.
			}
			
		}
		
		
	}
		
	
	public void list() {
		if(mcount>0) {
		System.out.println("이름\t나이\t핸드폰\t\t주소");
		for(int i=0;i<mcount;i++) {
			System.out.println(ar[i]);
		}
		}else if(mcount==0) System.out.println("회원이 0명 입니다");	
	}
	
	
	public void update() {
		System.out.print("휴대폰 번호 입력 : ");
		String searchNum = scan.next();
		int count = 0;
		for(int i=0;i<mcount;i++) {
			if(ar[i].getPhoneNum().equals(searchNum)) {
				System.out.println(ar[i].getName()+"\t"
								  +ar[i].getAge()+"\t"
								  +ar[i].getPhoneNum()+"\t\t"
								  +ar[i].getAddress());
				System.out.print("수정 할 이름 입력 : ");
				ar[i].setName(scan.next());
				System.out.print("수정 할 핸드폰 입력 : ");
				ar[i].setPhoneNum(scan.next());
				System.out.print("수정 주소 입력 : ");
				ar[i].setAddress(scan.next());
				System.out.println();
				System.out.println("업데이트 완료");
				break;
			}
			count++;
		}
		if(count==mcount) System.out.println("존재하지 않는 회원입니다");
		
	}
	
	public void delete() {
		System.out.print("휴대폰 번호 입력 : ");
		String searchNum = scan.next();
		int count = 0;
		int i;
		for( i=0;i<mcount;i++) {
			if(ar[i].getPhoneNum().equals(searchNum)) {
				ar[i]=null;
				mcount--;
				System.out.println("탈퇴 완료 되었습니다");
				if(i!=mcount && mcount!=0 ) {
					for(int j=i;j<mcount;j++){
						ar[j] = new MemberDTO();
						ar[j].setName(ar[j+1].getName());
						ar[j].setAge(ar[j+1].getAge());
						ar[j].setPhoneNum(ar[j+1].getPhoneNum());
						ar[j].setAddress(ar[j+1].getAddress());
					}//for
//					ar[mcount]=null;	
				}//if
			}//if
			count++;
		}//for i
		if(count==mcount) System.out.println("존재하지 않는 회원입니다");
//		System.out.println(count);
//		System.out.println(mcount);
	}
//	ar[0]=null; // 주소값을 null로 만들어서 연결을 끊으면 나중에 알아서 삭제됨.
	
}
