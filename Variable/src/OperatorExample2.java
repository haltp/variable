
public class OperatorExample2 {
	public static void main(String[] args) {

		int num1 = 3;

//		int result = 0; // 짝수:0, 홀수:1
		// 1) if구문
		// 2) ? : 구문
		if(num1%2 == 0) {
			System.out.println("num1은 짝수입니다");
		} else {
			System.out.println("num1은 홀수입니다");			
		}

		boolean result1 = true;
		String result2 = (num1 % 2) == 0 ? "True" : "False";
		System.out.println(result2);
		}
	}
