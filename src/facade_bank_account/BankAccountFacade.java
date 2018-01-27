package facade_bank_account;

public class BankAccountFacade {

	private int accntNumber;
	private int secNumber;
	
	AccountNumberCheck accNumCheck;
	FundsCheck fundsCheck;
	SecurityCodeCheck secCodeCheck;
	WeclomeToBank welcome;
	
	public BankAccountFacade(int newAccountNumber, int newSecurityNumber) {
		accntNumber = newAccountNumber;
		secNumber = newSecurityNumber;
		
		accNumCheck = new AccountNumberCheck();
		fundsCheck = new FundsCheck();
		secCodeCheck = new SecurityCodeCheck();
		welcome = new WeclomeToBank();
	}

	public int getAccntNumber() {
		return accntNumber;
	}

	public int getSecNumber() {
		return secNumber;
	}
	
	public void withdrawCash(double cashToGet) {
		if(accNumCheck.accountActive(getAccntNumber())
				&& fundsCheck.haveEnoughMoney(cashToGet) && 
				secCodeCheck.isCodeCorrect(getSecNumber())) {
			System.out.println("Transaction complete");
		} else {
			System.out.println("Transaction Failed");
		}
	}
	
	public void depositCash (double cashToDeposit) {
		if(accNumCheck.accountActive(getAccntNumber())
				&& secCodeCheck.isCodeCorrect(getSecNumber())) {
			fundsCheck.makeDeposit(cashToDeposit);
			System.out.println("Transaction complete");
		} else {
			System.out.println("Transaction Failed");
		}
	}
}
