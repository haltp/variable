package iteration;

public class WhileMyExample {
	public static void main(String[] args) {
		int sum = 0, i = 0;
		while (true) { // true 넣으면 참이니까 무한반복
			sum += i; // i값을 sum에 합하겠다
			if (i == 10) {
				break; // break가 무한반복 멈춰준다
			}
			i++;
			
		}System.out.println(sum);

	}

}
