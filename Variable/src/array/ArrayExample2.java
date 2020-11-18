package array;

public class ArrayExample2 {
	public static void main(String[] args) {
		double result = 0;
		double [] dAry = {23.2, 55.3, 52.8, 62.8};
		result = doubleSum(dAry);
		System.out.println("결과값: " + result);
	}

	// double [] => 23.2, 55.3, 52.8, 62.8 : dAry
	// method: doubleSum(), 매개변수 : double[]
	// 반환해주는 값: double.
	public static double doubleSum(double[] dAry) {
		double sum = 0;
		for (double num : dAry) {
			sum += num;
		}
		return sum;
	}
}
