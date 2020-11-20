package variable6;

public class Member {
	private int num;
	private String name;
	private String phone;
	private String className;

	
	public Member() {
	}
	
	public Member(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	public Member(int num, String name, String phone, String className) {
		this.num = num;
		this.name = name;
		this.phone = phone;
		this.className = className;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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

	@Override
	public String toString() {
		return "Member [num=" + num + ", name=" + name + ", phone=" + phone + ", className=" + className + "]";
	}
}
