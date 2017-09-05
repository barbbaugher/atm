package atm;

public class ATM {

	String requiredPin = "1234";

	Boolean allowAccess(String enteredPin) {
		if (requiredPin.equals(enteredPin)) {
			return true;
		}
		return false;
	}
}