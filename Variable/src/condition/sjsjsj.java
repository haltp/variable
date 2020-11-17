package condition;

public class sjsjsj {
	public static void main(String[] args) {
		int sum7 = 56, sum8 = 56, i = 1;
		if (i % 7 == 0) {
			sum7 += i;
		} else if (i % 8 == 0) {
			sum8 += i;
		}
		System.out.println("sum7: " + sum7);
		System.out.println("sum8: " + sum8);
	}
}