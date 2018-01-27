package facade_bank_account;

public class SecurityCodeCheck {
	private int securityCode = 12345;

	public int getSecurityCode() {
		return securityCode;
	}
	
	public boolean isCodeCorrect(int securityCodeToCheck) {
		if(getSecurityCode() == securityCodeToCheck) {
			return true;
		} else {
			return false;
		}
	} 
}
