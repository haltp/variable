package array;

public class MethodExanple1 {
	public static void main(String[] args) {
		showInfo("이나경");
		int re = showDouble(20);
		int res = sum(10, 5);
		int resu = multi(2, 3, 4);
		double result = divide(10, 100); // divide는 임의로 지정한 값, 내가 맘대로 써도 된다, 단 밑의 메소드와 같아야한다
		System.out.println("반환*2: " + re); // int re = showDouble(20); 지정했으니까 20*2
		System.out.println("반환*3: " + showDouble(30.2));
		System.out.println("반환a+b: " + res);
		System.out.println("반환a*b*c: " + resu);
		System.out.println("큰수에서 작은수 나눈 값: " + result);
	}

	public static void showInfo(String name) { // 숫자넣고싶으면 int, 문자넣고싶으면 String(S 대문자 필수)
		System.out.println("안녕하세요. " + name + "입니다.");
	}

	public static int showDouble(int num) {
		return num * 2;
	}

	public static double showDouble(double num) {
		return num * 3;
	}

	// 정수형 변수 2개를 받아서 두수의 합을 반환해주는 메소드(sum)
	public static int sum(int a, int b) {
		int res = 0;
		res = a + b;
		return res;
	}

	// 정수형 변수 3개를 받아서 세수의 곱을 반환 메소드(multi)
	public static int multi(int a, int b, int c) {
		int resu = 0;
		resu = a * b * c;
		return resu;
	}

	// double 2개를 받아서 첫번째 매개변수/ 두번째 매개변수(divide)
//	public static double divide(double a, double b) {
//		double result = 0;
//		result = a / b;
//		return result;
//	}
	// double 2개를 받아서 큰수/ 작은수(divide)
	public static double divide(double a, double b) { // divide는 임의로 지정한 값, 내가 맘대로 써도 된다, 단 위의 메소드와 같아야한다
		double result = 0;
		if (a > b) {
			result = a / b;
		} else {
			result = b / a;
		}
		return result;
	}
}