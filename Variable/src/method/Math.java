package method;

public class Math {

	private double pi = 3.14;

	// 1.
	public double sum(double a, double b) {
		return a + b;
	}
	// 1.----------------------------------

	// 2.
	public double getArea(double r) {
		return pi * r * r;
	}
	// 2.-------------------------------

	// 3.
	public double getRectangle(double l) {
		return l * l;
	}
	// 3.-------------------------------

	// 4.
	public double getRectangle(double l, double n) {
		return l * n;
	}
	// 4.-----------------------------------

	// int 배열의 합 구하는 메소드.
	public int getArySum(int[] ary) {
		int sum = 0;
		for (int num : ary) {
			sum += num;
		}
		return sum;
	}
	//-------------------------------------
	
	//사람의 적정 몸무게 구하는 메소드.(Person)
	public double getProperWeight(Person p1) { //괄호 안의 Person이 중요 Person클래스로 받겠다는 의미 뒤의 p1는 임의지정
		//(키-100) *0.9;
		double properWeight = (p1.height -100)*0.9;
		return properWeight;
	}
	//---------------------------------------
	
	//연습
	public double getProperWeight(double height) { //괄호 안의 Person이 중요 Person클래스로 받겠다는 의미 뒤의 p1는 임의지정
		//(키-100) *0.9;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
		double properWeight = (height -100)*0.9;
		return properWeight;
	}
	
	

}
