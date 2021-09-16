package newBankApp;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {
	// Account객체를 아이템으로 갖을 수 있음.
	// 참조타입이 아이템일 경우 null 초기화됨.
	private static ArrayList<Account> accountArray = new ArrayList<Account>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택>");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}

		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		System.out.println("---------------");
		System.out.println("계좌생성");
		System.out.println("---------------");
		
		System.out.print("계좌번호:");
		String ano = scanner.next();
		
		System.out.print("계좌주:");
		String owner = scanner.next();
		
		System.out.print("초기입금액:");
		int balance = scanner.nextInt();
		
		accountArray.add(new Account(ano, owner, balance));
		
		System.out.println("결과: 계좌가 생성되었습니다.");
		
	}

	private static void accountList() {
		System.out.println("---------------");
		System.out.println("계좌목록");
		System.out.println("---------------");
		
	
		for(Account a : accountArray) {
			System.out.println(a);
		}
	}

	private static void deposit() {
		System.out.println("---------------");
		System.out.println("예금");
		System.out.println("---------------");
		
		System.out.print("계좌번호:");
		String ano = scanner.next();
		Account account = findAccount(ano);
		if(account==null) {
			System.out.println("계좌번호를 확인하고 다시 실행해주세요");
			return;
		}
		
		System.out.print("예금액:");
		int money = scanner.nextInt();
		
		
		if (account != null) {
			int balance = account.getBalance() + money;
			account.setBalance(balance);
			
			System.out.println("결과: 예금이 성공되었습니다.");
		}
		
	}
	
	private static void withdraw() {
		System.out.println("---------------");
		System.out.println("출금");
		System.out.println("---------------");
		
		System.out.print("계좌번호:");
		String ano = scanner.next();
		
		Account account = findAccount(ano);
		if(account==null) {
			System.out.println("계좌번호를 확인하고 다시 실행해주세요");
			return;
		}
		System.out.print("출금액:");
		int money = scanner.nextInt();
		
		
		if (account != null) {
			int balance = account.getBalance() - money;
			account.setBalance(balance);
			
			System.out.println("결과: 출금이 성공되었습니다.");
		}
	}
	
	private static Account findAccount(String ano) {
		for(Account com :accountArray) {
			if(com.getAno().equals(ano)) {
				return com;
			}
		}
		
		
		System.out.println("계좌번호가 존재하지 않습니다.");
		return null;
	}
}








