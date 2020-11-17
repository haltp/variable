package iteration;

public class ForMultiTable {
	public static void main(String[] args) {
		for (int num = 1; num <= 9; num++) {
			System.out.println("[" + num + "단]");
			for (int i = 1; i <= 9; i++) {
				System.out.println(num + "*" + i + " = " + (num * i));
			}
		}
	}
}