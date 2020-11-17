package iteration;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int balance = 0;

		while (run) {
			System.out.println("------------------------------");
			System.out.println("1.예금 ㅣ 2.출금 ㅣ 3.잔고 ㅣ 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택> ");
			int menu = scn.nextInt();
			if(menu == 1) {
				System.out.println("예금액> ");
				balance += scn.nextInt();
				
			}else if(menu == 2) {
				System.out.println("출금액> ");
				balance -= scn.nextInt();
				
			}else if(menu == 3) {
				System.out.println("잔고> " + balance);
				
			}else if(menu == 4) {
				run = false; //while이 true일때만 작동하니까
			}
		} //end of while
		System.out.println("프로그램 종료");
	} //end of main()
} //end of class
