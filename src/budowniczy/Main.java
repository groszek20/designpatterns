package budowniczy;

public class Main {

	public static void main(String[] args) {
		
		Builder budowniczy1 = new ZestawABC996();
		Builder budowniczy2 = new ZestawXT001();
		
		Director szef = new Director();
		
		szef.setBuilder(budowniczy1);
		szef.sk³adaj();
		ZestawKomputerowy zestaw1 = szef.getZestaw();
		System.out.println(zestaw1);
		
		szef.setBuilder(budowniczy2);
		szef.sk³adaj();
		ZestawKomputerowy zestaw2 = szef.getZestaw();
		System.out.println(zestaw2);

	}

}
