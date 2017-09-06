package atm;

public class ATM {

	String requiredPin = "1628";

	Boolean allowAccess(String enteredPin) {
		if (requiredPin.equals(enteredPin)) {
			return true;
		}
		return false;
	}
	
	double balance = 100.00;
	
	void deposit (double amount) {
		balance += amount;
	}
	
	void withdrawal (double amount) {
		balance -= amount;
	}
}