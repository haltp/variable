package array;

public class ArrayExample4 {
	public static void main(String[] args) {
		int[][] intAry = new int[3][3]; // [3][3] 3행 3열이라는 의미
		intAry[0] = new int[] { 11, 12, 13 };
		intAry[1] = new int[] { 21, 22, 23 };
		intAry[2] = new int[] { 31, 32, 33 };

		System.out.println(intAry[0][0]);// 11 0행 0열값

		System.out.println(intAry[0].length);// 3 0행의 갯수

		for (int i = 0; i < intAry.length; i++) {
			for (int j = 0; j < intAry[i].length; j++) {
				System.out.println("intAry[" + i + "," + j + "]>" + intAry[i][j]);
			}
		}
		int[][] intAry2 = { { 11, 12, 13 }, { 21 }, { 31, 32 } };
//		System.out.println(intAry2[0].length);// 행이 몇개인지 나온다

		// intAry2의 배열의 각 합, 평균

		// intAry2[0]=> 합: ??, 평균: ??
		// intAry2[1]=> 합: ??, 평균: ??
		// intAry2[2]=> 합: ??, 평균: ??
		int sum = 0;
		for (int i = 0; i < intAry2.length; i++) {
			for (int j = 0; j < intAry2[i].length; j++) {
				sum += intAry2[i][j];
			}
			System.out.println("intAry2의 배열의 합: " + sum);
			sum = 0;
		}
	}
}
