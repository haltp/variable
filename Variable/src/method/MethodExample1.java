package method;

public class MethodExample1 {
	public static void main(String[] args) {
		//1.--------------------------------
		Rectangle r1 = new Rectangle(); // int, double, String이 아닌 Rectangle 변수로 지정 Rectangle뜻은 Rectangle클래스?
		r1.drawRectangle(); // 콘솔 출력
		String result = r1.getRectangle(); // String으로 해야 오른쪽 왼쪽이 같아진다
		System.out.println("결과: " + result);
		
		//2.--------------------------------
		r1.drawShape("OOO"); // 콘솔 출력
		
	}
}
