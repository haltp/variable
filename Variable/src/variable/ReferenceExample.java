package variable;

public class ReferenceExample {
	public static void main(String[] args) {
		String str1 = "Hello"; //주소값..
		String str2 = "Hello"; //주소값.. 
		String str3 = new String("Hello"); 
		
		
		//if(str1 == str2) {
		//	System.out.println("동일한 주소값.");
		//}else {
		//	System.out.println("다른 주소값."); //str1=str2 하면 동일한 주소값나온다
		//}
		
		//if(str1 == str3) {
		//	System.out.println("동일한 주소값.");
		//}else {
		//	System.out.println("다른 주소값."); //new라고 하면 새로운 주소값이 들어가서 str1=str3하면 다른 주소값나온다
		//}
		
		if(str1.equals(str3)) {
			System.out.println("동일한 주소값.");
		}else {
			System.out.println("다른 주소값."); //동일한 주소값이 나온다
		}
	}
}
