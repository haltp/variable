package variable4;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setNum(1);
		m1.setName("이나경");
		m1.setPhone("010-1234-5678");
		m1.setClassName("스포츠댄스");
		
		System.out.println(m1.getNum());
		System.out.println(m1.getName());
		
		System.out.println(m1);
	}
}
