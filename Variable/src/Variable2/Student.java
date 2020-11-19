package Variable2;

public class Student {
	private String name;
	private int number;
	private int math;
	private int english;
	//1.
	public void studentInfo() { //반환값이 있으면 void
		System.out.println("이름: " + name + ", 학번: " + number + "입니다.");
	}
	//1.----
	//2.
	public int totalScore() { //반환값이 있으면 int나 double
		return math+english;
	}
	//여기서부터는 반환값을 만드는 과정
	public void setName(String name) {
		this.name = name;
	}

	public void setNum(int number) {
		this.number = number;
	}

	public void setmath(int math) {
		this.math = math;
	}

	public void setenglish(int english) {
		this.english = english;
	}
	public String getName() {
		return this.name;
	}

	public int getNum() {
		return this.number;
	}

	public double getmath() {
		return this.math;
	}
	public double getenglish() {
		return this.english;
	}
	//2.-----

}
