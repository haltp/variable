package array;

public class ArrayExample3 {
	public static void main(String[] args) {
		int num1 = 80, num2 = 20, num3 = 30;
		int temp; 

		if (num1 > num2) {
			if (num1 > num3) {
				temp = num1;
			} else {
				temp = num3;
			}
		}
		if (num2 > num3) {
			if (num2 > num1) {
				temp = num2;
			} else {
				temp = num1;
			}
		} else {
			temp = num3;
		}
		System.out.println("큰수는: " + temp);
		
		//배열로도 할 수 있다
		temp = 0;
		int[] intAry = {34, 25, 57, 39, 55};
		for (int num : intAry) {
			if(temp < num) {
				temp = num;
			}
		}
		System.out.println("큰수는: " + temp);
	}

}
