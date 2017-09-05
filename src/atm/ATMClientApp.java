package atm;

import java.util.Scanner;

public class ATMClientApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ATM automatedTellerMachine = new ATM();

		System.out.println("Please enter your pin: ");
		String enteredPin = input.next();

		System.out.println("Allow access? " + automatedTellerMachine.allowAccess(enteredPin));

		input.close();
	}

}
