package classicBuilder2_z_podpowiedziami_cos_dziala;

public class MainApp {

	public static void main(String[] args) {
		Builder budowniczy = new ZestawAdama();
		Director szef = new Director(budowniczy);

		szef.TwórzZestaw();
		
		
		ZestawKomputerowy zk = szef.getZestaw();
		
		System.out.println(zk);
	}

}
