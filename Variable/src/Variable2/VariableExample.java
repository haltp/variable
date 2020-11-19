package Variable2;

public class VariableExample {
	public static void main(String[] args) {
		int num = 10; // 숫자를 하나만 담을 수 있다
		String str = "Hello"; // 문자를 하나만 담을 수 있다
		double db1 = 3.4; // 소수를 하나만 담을 수 있다

		String name = "Hong";
		int age = 10;
		double height = 178.8; // Hong, 10, 178.8 세개의 변수를 넣고싶다

		String name1 = "Hwang";
		int age1 = 15;
		double height1 = 188.8; // Hwang, 115, 188.8 세개의 변수를 넣고싶다

		Person p1 = new Person("Choi", 20, 175.5, 72.4); // Person이라는 클래스에 어쩌고 //new 지정하는 걸 잊지말자
		System.out.println("p1의 이름:" + p1.getName());
		System.out.println("p1의 나이:" + p1.getAge());
		System.out.println("p1의 키:" + p1.getHeight());
		System.out.println("p1의 몸무게:" + p1.getWeight());
		
		System.out.println("-----------------------");
//		Person p1 = new Person(); // Person이라는 클래스에 어쩌고 //new 지정하는 걸 잊지말자
//		p1.name = "Hong"; //필드에 private 해놓으면 접근이 안되어서 빨간줄 에러 생긴다
//		p1.age = 10;
//		p1.height = 178.8;
		p1.setName("홍");
		p1.setAge(11);
		p1.setHeight(178.8);
//		p1.showInfo();
		System.out.println("p1의 이름:" + p1.getName());
		System.out.println("p1의 나이:" + p1.getAge());
		System.out.println("p1의 키:" + p1.getHeight());

		Person p2 = new Person();
//		p2.name = "Hwang";
//		p2.age = 15;
//		p2.height = 188.8;
		p2.setName("Hwang");
		p2.setAge(15);
		p2.setHeight(188.8);
//		p2.showInfo();

		Person p3 = new Person();
//		p3.name = "Park";
//		p3.age = 17;		
//		p3.height = 168.8;
		p3.setName("Park");
		p3.setAge(17);
		p3.setHeight(168.8);
//		p3.showInfo();

//		System.out.println();   //블록 처리해서 ctrl +/누르면 한번에 주석이 된다

//		System.out.println(p1.name);
//		System.out.println(p1.age);
//		System.out.println(p1.height);

//		System.out.println(p2.name);
//		System.out.println(p2.age);
//		System.out.println(p2.height);

//		System.out.println(p3.name);
//		System.out.println(p3.age);
//		System.out.println(p3.height);
//		System.out.println(p3.weight); // 필드에 지정해주고 값을 지정하지 않으면 오류는 아니고 0으로 나온다

//		Person[] persons = {p1, p2, p3}; //Person[] 앞글자 대문자
//		for(Person per : persons) {
//			System.out.println(per.name);
//			System.out.println(per.age);
//			System.out.println(per.height);
	}
}
