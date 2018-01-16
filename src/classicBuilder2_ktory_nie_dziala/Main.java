package classicBuilder2_ktory_nie_dziala;

public class Main {

	public static void main(String[] args) {
		Builder budowniczy = new ZestawABC1();
		Director kierownik = new Director(budowniczy);
		kierownik.sk³adaj();
		kierownik.getZestaw();
	}

}
