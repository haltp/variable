package Variable2;

public class Person {
	// 필드 ******필수암기******여긴 필드다************클래스 안에는 필드가 있다*************필드에 값을
	// 넣는다*********
	private String name;
	private int age;
	private double height;// 필드 세개가 있다
	private double weight; // private: 외부에서 못쓰게 접근금지
	
	//생성자: 필드의 초기값 지정.
	public Person() {
		this.name = "초기이름";
		this.age = 10;
		this.height = 170.0;
		this.weight = 65.0;
	}
	
	public Person(String name, int age) { 
		this.name = name;
		this.age = age;
	}
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	

	// 메소드 ***기능***
	public void showInfo() { //반환값이 없으면 void를 쓴다
		System.out.println("이름: " + name + ", 나이: " + age + ", 키: " + height + "입니다."); // 필드의 name 의미
	}

	// 필드에 값을 저장, 불러오는 기능
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if (age > 0)
			this.age = age;// private으로 접근금지되어서 다른 클래스에서 못보지만 같은 클래스에선 보기 가능하기 때문에 따로 this.age라고 지정해주어서 다른
							// 클래스에서 볼 수 있다.
		else
			this.age = 0;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getName() { // String int double 주의
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public double getHeight() {
		return this.height;
	}
	public double getWeight() {
		return this.weight;
	}
}
