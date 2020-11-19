package array;

public class MorningCode {
	public static void main(String[] args) {
		int num = 1;
		int[][] intAry = new int[5][5];
		for(int i = 0; i<intAry.length; i++) {
			for (int j = 0; j <intAry[i].length; j++) {
				System.out.println("intAry["+i+"]["+j+"]>"+num++);
			}	
		}
		
		
		
	}
}
