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
				System.out.println("What would you like to do next?");
				System.out.println("Press 1 to deposit funds");
				System.out.println("Press 2 to withdraw funds");
				System.out.println("Press 3 to check your balance");
				System.out.println("Press 4 to exit");
				menuEntry = input.nextInt();
			} while (menuEntry != 1 && menuEntry != 2 && menuEntry != 3 && menuEntry != 4);

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
			} else if (menuEntry == 3) {
				System.out.println("Your current account balance: " + telhio.balance);
			} else if (menuEntry == 4) {
				System.out.println("Thank you.  Have a nice day!");
				System.exit(0);
			}

		}

		input.close();
	}

}
