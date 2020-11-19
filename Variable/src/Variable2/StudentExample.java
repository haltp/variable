package Variable2;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("이나경");
		s1.setNum(20131212);
		s1.setNum(2013049068); //순서대로 내려오면서 실행하다보면 20131212가 2013049068에 덮어씌인다
		s1.setmath(70);
		s1.setenglish(80);
		
		s1.studentInfo();
		System.out.println("합계점수: " +s1.totalScore()); //반환값이 지정된 메소드 출력
		
		
		
		
		
		
//		Student s1 = new Student(); // new 지정하는 걸 잊지말자
//		s1.name = "이나경";
//		s1.number = 2013049068;
//		s1.math = 100;
//		s1.english = 98;
//
//		Student s2 = new Student(); // new 지정하는 걸 잊지말자
//		s2.name = "이나굥";
//		s2.number = 2013049077;
//		s2.math = 50;
//		s2.english = 78;
//
//		Student[] s = { s1, s2 };
//		for (Student stu : s) {
//			System.out.println(stu.name);
//			System.out.println(stu.number);
//			System.out.println(stu.math);
//			System.out.println(stu.english);

	}
}
