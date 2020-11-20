package variable5;

public class Member {
	private int num;
	private String name;
	private String phone;
	private String className;

	public Member() { // 기본생성자:매개변수X

	}
	//마우스 우클릭>source > constructor
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

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getClassName() {
		return className;
	}

}
