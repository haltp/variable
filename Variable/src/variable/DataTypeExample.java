package variable;

public class DataTypeExample {
	public static void main(String[] args) {
		byte num1 = 12;
		short num2 = 128;
		int num3 = 1000000000; //담을 수 있는 크기가 다르다
		long num4 = 100000000000000000L;

		byte val1 = 10;
		num3 = val1; //자동으로 형변화해준다 = 프로모션 promotion
		
		byte result = (byte) (num1 + val1); //강제로 byte로 변환 = 캐스팅 casting 
		//연산자가 들어가면 int타입이다 따라서 강제로 byte로 변환한것
		
//		num1 = 120; //바이트타입은 : -128~127
//		num1++; //++는 int타입인데 num1이 바이트타입이라서 그래도 바이트타입된다
//		num1++;
//		num1++;
//		num1++;
//		num1++;
//		num1++;
//		num1++;
//		num1++;//128
//		System.out.println(num1);
		
		num1 = 120; //바이트타입은 : -128~127
		for (int i =0; i<20; i++) {
			System.out.println(num1++); //120부터 127까지 올라갔다가 다시 -128부터 시작
		}
		
		char char1 = 65; //정수에 해당하는 문자를 출력 65=A, 66=B, 97=a
		for (int i= 0; i<26; i++)
		System.out.println(char1++);//A부터 Z까지 나온다
		
		float floatVal = 4.567F;
		double doubleVal = 3.4567;
		
		
		
	}
}
