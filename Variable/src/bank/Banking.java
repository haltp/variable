package bank;

import java.util.Scanner;

public class Banking {
	public static void main(String[] args) {
		Customer[] customers = new Customer[100];
		Scanner scn = new Scanner(System.in); // 여기서 ctrl+쉬프트+o 누르면 위에 임폴트 자바 어쩌고 자동입력된다
		boolean run = true;

		while (run) {
			System.out.println("-----------------------------------");
			System.out.println("1.계좌생성 2.리스트 3. 입금 4. 출금 5. 종료");
			System.out.println("-----------------------------------");
			System.out.print("선택> ");

			int selectNo = scn.nextInt();
			scn.nextLine(); // scn.nextLine(); 계좌번호입력>이 뜨고 옆에 커서 깜박깜박거리게 하는것
			if (selectNo == 1) {
				System.out.println("1.계좌생성 선택했습니다.");
				System.out.print("계좌번호 입력> ");
				String accNo = scn.nextLine(); // nextLine은 엔터까지 같이 입력되어서 계좌번호 엔터가 실행되어 값을 입력하지 못하고 엔터가 되어서 계좌번호에 null값이
												// 들어가고 바로 계좌주입력>에 입력하라고 깜박거린다
				System.out.print("계좌주 입력> ");
				String owner = scn.nextLine();
				System.out.print("입금액 입력> ");
				int balance = scn.nextInt();
				Customer c1 = new Customer(accNo, owner, balance);
				for (int i = 0; i < customers.length; i++) {
					if (customers[i] == null) {
						customers[i] = c1;
						break;
					}
				}
				System.out.println("한건 입력 완료.");

			} else if (selectNo == 2) {
				System.out.println("2.리스트 선택했습니다.");
				for (int i = 0; i < customers.length; i++) {
					if (customers[i] != null) // if 실행구문이 한줄밖에 없으면 {}없어도 된다
						customers[i].showAccountInfo();
				}

			} else if (selectNo == 3) {
				System.out.println("3.입금 선택했습니다.");
				System.out.print("계좌번호 선택> ");
				String accNo = scn.nextLine();
				System.out.println("입금액 입력>");
				int balance = scn.nextInt();
				for (int i = 0; i < customers.length; i++) { // 배열을 돌면서 맞는 계좌번호를 찾는다
					if (customers[i] != null && accNo.equals(customers[i].getBankAccount())) {
						int currentBalance = customers[i].getBalance();
						customers[i].setBalance(currentBalance + balance);
					}
				}

			} else if (selectNo == 4) {
				System.out.println("4.출금 선택했습니다.");
				System.out.print("계좌번호 선택> ");
				String accNo = scn.nextLine();
				System.out.println("출금액 입력>");
				int balance = scn.nextInt();
				for (int i = 0; i < customers.length; i++) {
					if (customers[i] != null && accNo.equals(customers[i].getBankAccount())) {
						int currentBalance = customers[i].getBalance();
						customers[i].setBalance(currentBalance - balance);
					}
				}
				
				

			} else if (selectNo == 5) {
				System.out.println("5.종료 선택했습니다.");
				run = false;

			}
		} // end of while
		System.out.println("프로그램 종료.");

	}
}
