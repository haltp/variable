package variable;

public class MorningCode {
	public static void main(String[] args) {
		int[] numbers = { 23, 56, 34, 65, 28, 21 };
		int avg = 0;
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]%2 != 0) {
				System.out.println(numbers[i]);
				sum += numbers[i]; 
				avg++; //avg가 3이된다
			}	
		}	 
		System.out.println("홀수값의 합: " + sum);
		System.out.println("홀수값의 평균: " + sum/avg);
	}
}