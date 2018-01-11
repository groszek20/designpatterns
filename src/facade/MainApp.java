package facade;

public class MainApp {

	public static void main(String[] args) {
		
		BankAccountFacade accesingBank = new BankAccountFacade(123456789, 12345);
		accesingBank.withdrawCash(50.00);
		accesingBank.withdrawCash(9000.00);
		accesingBank.depositCash(900.00);

	}

}
