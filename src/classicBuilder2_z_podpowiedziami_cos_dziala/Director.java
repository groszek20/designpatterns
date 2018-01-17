package classicBuilder2_z_podpowiedziami_cos_dziala;

public class Director {

	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void TwórzZestaw() {
		builder.buildMonitor();
		builder.buildStacjaRobocza();
	}
	
	public ZestawKomputerowy getZestaw() {
		return builder.getZestawKomputerowy();
	}
}
