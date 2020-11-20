package variable4;

public class Member {
	private int num;
	private String name;
	private String phone;
	private String className;
	
	
	//마우스 우클릭>source > getting and setting
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;  //this 쓰는 이유는 앞의 num과 뒤의 num을 구분하기 위해서
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	//마우스 우클릭>source > toString
	@Override
	public String toString() {
		return "Member [회원번호=" + num + ", 회원이름=" + name + ", 연락처=" + phone + ", 강좌명=" + className + "]";
	}
	
}
