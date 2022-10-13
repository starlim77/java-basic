package class_;

public class MemberDTO {//1인분. , MemberVO
	private String name, phoneNum, address;
	private int age;
	
	public void setName(String n) { // 인수 명을 this.name = name; 으로 똑같이 잡아준다.
		name = n;
	}
	public void setPhoneNum(String p) {
		phoneNum = p;
	}
	public void setAge(int a) {
		age = a;
	}
	public void setAddress(String a) {
		address = a;
	}
	public String getName() {
		return name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public String getAddress() {
		return address;
	}
	public int getAge() {
		return age;
	}
	@Override
		public String toString() {
			return name+"\t"+age+"\t"+phoneNum+"\t"+address;
		}
	
	
}
