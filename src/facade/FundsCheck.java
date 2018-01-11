package facade;

public class FundsCheck {
	private double cashInAccount = 1000.00;
	
	public double getCashInAccount() {
		return cashInAccount;
	}
	
	public void decreaseCashInAccount(double cashWithdrawn) {
		cashInAccount -= cashWithdrawn;
	}
	
	public void increaseCashInAccount(double cashIncome) {
		cashInAccount += cashIncome;
	}
	
	public boolean haveEnoughMoney (double cashToWithdrawal) {
		if (getCashInAccount() < cashToWithdrawal) {
			System.out.println("Error: Enough money!");
			System.out.println("Current balance is: " + getCashInAccount());
			return false;
		} else {
			decreaseCashInAccount(cashToWithdrawal);
			System.out.println("Widrawal Succes!");
			System.out.println("Current balance is: " + getCashInAccount());
			return true;
		}
	}
	
	public void makeDeposit (double cashToDeposit) {
		increaseCashInAccount(cashToDeposit);
		System.out.println("Deposit Create!");
		System.out.println("Current balance is: " + getCashInAccount());
	}
}
