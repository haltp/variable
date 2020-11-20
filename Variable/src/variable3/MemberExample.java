package variable3;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.num = 1;
		m1.name = "이나경";
		m1.phone = "010-1234-5678";
		m1.className = "스포츠댄스";

//		m1.showMemberInfo();

		Member m2 = new Member();
		m2.num = 2;
		m2.name = "송다희";
		m2.phone = "010-2525-5656";
		m2.className = "수영";

//		m2.showMemberInfo();

		Member[] Members = { m1, m2 };
		for (Member Mem : Members) {
			System.out.println("회원번호: " + Mem.num + ", 회원이름: " + Mem.name + ", 강좌명: " + Mem.className + "입니다.");
		}
	}
}
