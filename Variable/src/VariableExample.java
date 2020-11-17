
public class VariableExample {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		String resultStr = "결과값은 ";

		int result = num2 - num1;
		int result1 = num1 -num2;
		
		if (num2 > num1) {
			System.out.println(resultStr + result);
		}	else {
			System.out.println(resultStr + result1);
			}
		}
	}