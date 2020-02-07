package applicationDAO;

import java.util.Scanner;
import entitiesTO.AccountTO;

public class AccountDAO {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		AccountTO account;

		System.out.println("Enter the Account Number: ");
		int number = sc.nextInt();
		System.out.println("Enter the Account Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Is there an initial deposit (Y/N): ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.println("Enter the initial deposit: ");
			double initialDeposit = sc.nextDouble();
			account = new AccountTO(number, holder, initialDeposit);
		} else {
			account = new AccountTO(number, holder);
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println(account);
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println(account);
		sc.close();
	}

}
