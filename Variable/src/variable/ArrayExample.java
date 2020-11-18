package variable;

public class ArrayExample {
	public static void main(String[] args) {
//		int num1 = 10;
//		int num2 = 20;

//		int[] numbers = {10, 20, 30, 40, 50}; //이런형식이면 여러가지 값을 담을 수 있다.
//		System.out.println(numbers[0]); //numbers에 첫번째 값을 가져오시오
//		System.out.println(numbers[1]); //numbers에 두번째 값을 가져오시오

//		numbers[1] = 200;               //numbers에 두번째 값을 200으로 지정
//		System.out.println(numbers[1]); //numbers에 두번째 값이 200으로 나온다

//		for(int i=0; i<5; i++) {
//			System.out.println(numbers[i]);
		// i가 0일때 numbers의 첫번째 값
		// i가 1일때 numbers의 두번째 값
		// i가 2일때 numbers의 세번째 값
		// i가 3일때 numbers의 네번째 값
		// i가 4일때 numbers의 다섯번째 값

//		int[] numbers = {10, 20, 30, 40, 50};
//		int sum = 0;
//		for(int i=0; i<5; i++) {
//			System.out.println(numbers[i]);
//			sum += numbers[i]; //0+10+20+30+40+50
//		}
//		System.out.println("합: " + sum);

		
		
//		String[] strings = { "Hello ", "World ", "Nice ", "To ", "Meet" };
//		for (int i = 0; i < strings.length; i++) { //length = 배열
//			System.out.print(strings[i]); //Hello World Nice To Meet 출력
			
			
			
		String[] strings = { "Hello ", "World ", "Nice ", "To ", "Meet" };
		for (int i = 0; i < strings.length; i++) {	
		strings[2] = "Good ";
		System.out.print(strings[i]); //Hello World Nice To Meet 대신 Hello World Good To Meet 출력
		}
	}
}
