package facade;

public class AccountNumberCheck {
	private int accountNumber = 123456789;

	public int getAccountNumber() {
		return accountNumber;
	}
	
	public boolean accountActive (int accountNumToCheck) {
		if (getAccountNumber() == accountNumber) {
			return true;
		} else {
			return false;
		}
	}
}
