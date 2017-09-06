package atm;

import java.util.Scanner;

public class ATMClientApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ATM telhio = new ATM();

		System.out.println("Welcome to the Bank of We Can Code IT ATM. \nPlease enter your pin: ");
		String enteredPin = input.next();

		System.out.println("Allow access? " + telhio.allowAccess(enteredPin));

		if (telhio.allowAccess(enteredPin) == true) {
			int menuEntry;
			do {
				System.out.println("Press 1 to deposit funds \nPress 2 to withdraw funds ");
				menuEntry = input.nextInt();
			} while (menuEntry != 1 && menuEntry != 2);
			if (menuEntry == 1) {
				System.out.println("Please enter your deposit amount:");
				double amount = input.nextDouble();
				telhio.deposit(amount);
				System.out.println("Your current account balance: " + telhio.balance);
			} else if (menuEntry == 2) {
				System.out.println("Please enter your withdrawal amount:");
				double amount = input.nextDouble();
				telhio.withdrawal(amount);
				System.out.println("Your current account balance: " + telhio.balance);

			}

		}

		input.close();
	}

}
