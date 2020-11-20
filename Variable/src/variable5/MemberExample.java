package variable5;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member(0, "Lee");
		System.out.println("이름: "+m1.getName());
		Member m2 = new Member(1, "Hong", "010-1234-5678", "수영");
		System.out.println("이름: "+m2.getName());
		Member m3 = new Member(2, "Hwang", "010-1234-5678", "수영");
		System.out.println("이름: "+m3.getName());
	}
}
