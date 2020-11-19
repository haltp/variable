package array;

public class ArrayExample {
	public static void main(String[] args) {
		int[] intAry = new int[0]; // {0, 0, 0, 0, 0}이 된다, 배열을 선언하면 기본값이 들어간다
//		intAry[0] = 15; // {15 0, 0, 0, 0}이 된다
//		intAry[4] = 33; // {15 0, 0, 0, 33}이 된다
		for(int i=0; i<5; i++) {
			System.out.println(intAry[i]);
		}
		
		double[] doubleAry; //0.0 소수점 포함값일때 double
		doubleAry = new double[] {2.3, 2, 4.5, 2.2, 1.6}; //배열은 선언하면서 값을 넣을 수 있다
		System.out.println(doubleAry[0]); //2.3이 나온다
		double sum = 0;
		for(int i=0; i<doubleAry.length; i++ ) {
			sum += doubleAry[i];
		}
		System.out.println("sum: " + sum);
		
		//enhanced for
		sum = 0;
		for(double db1 : doubleAry) { //doubleAry만큼 db1에 담아서 실행하시오
			sum += db1;
//			System.out.println(db1);
		}
		System.out.println("sum: " + sum);
	}
}
