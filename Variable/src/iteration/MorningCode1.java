package iteration;

public class MorningCode1 {
	public static void main(String[] args) {
		int sum7 = 0, sum8 = 0, i = 1;
		while (true) {
			if (i % 7 == 0) {
				sum7 += i;
			} else if (i % 8 == 0) {
				sum8 += i;
			}
			i++;
			if (sum7%i==0 && sum8%i==0) {
				break;
			}
		}
		System.out.println("sum7: " + sum7);
		System.out.println("sum8: " + sum8);
	}

}
