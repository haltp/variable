package method;

public class MethodExample {
	public static void main(String[] args) {
		Math m1 = new Math();
		// 1
		double sum = m1.sum(10, 20);
		System.out.println("결과: " + sum);
		// 1.------------------------------------

		// 2.
		double area = m1.getArea(5.5); // 원의 넓이구하는 공식 pi*r*r
		System.out.println("원의 넓이: " + area);
		// 2.---------------------------------------

		// 3.
		double rectangle = m1.getRectangle(4.2); // 정사각형 넓이
		System.out.println("정사각형 넓이: " + rectangle);
		// 3.------------------------------------

		// 4.
		double rectangle1 = m1.getRectangle(4.2, 2.4); // 직사각형 넓이
		System.out.println("직사각형 넓이: " + rectangle1);
		// 4.-----------------------------------

		// int 배열의 합 구하는 메소드.
		int[] ary = { 5, 10, 15 };
		int arysum = m1.getArySum(ary);
		System.out.println("배열 합: " + arysum);
		// ---------------------------------------

		// 사람의 적정 몸무게 구하는 메소드.(Person)
		Person p1 = new Person("이창호", 10, 135.5, 32.5); //person클래스에서 이름, 나이, 키, 몸무게 순으로 필드를 지정하였다
		double d1 = m1.getProperWeight(p1); //컨트로 마우스해서 뜨는창 두번째 누르면 어디에 연결되어 있는지 나온다, Math 클래스에 getProperWeight(Person p1)가 연결되어 있다
		if (p1.weight > d1) {
			System.out.println("체중과다");
		} else if (p1.weight == d1) {
			System.out.println("적정체중");
		} else {
			System.out.println("체중미달");
		}
		//---------------------------------------

		//연습
		Person height = new Person("이창호", 10, 135.5, 32.5); //person클래스에서 이름, 나이, 키, 몸무게 순으로 필드를 지정하였다
		double e1 = m1.getProperWeight(p1.height); //Math클래스에 getProperWeight(double height)가 연결되어있다.
		if (p1.weight > e1) {
			System.out.println("체중과다");
		} else if (p1.weight == e1) {
			System.out.println("적정체중");
		} else {
			System.out.println("체중미달");
		}
		
	}
}
