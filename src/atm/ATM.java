package atm;

public class ATM {

	String requiredPin;
	double balance;
	
	
	public ATM(String pin, double bankBalance) {
		requiredPin = pin;
		balance = bankBalance;
	}

	Boolean allowAccess(String enteredPin) {
		if (requiredPin.equals(enteredPin)) {
			return true;
		}
		return false;
	}
	
	void deposit (double amount) {
		balance += amount;
	}
	
	void withdrawal (double amount) {
		balance -= amount;
	}
}