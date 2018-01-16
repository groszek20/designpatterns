package classicBuilder2_ktory_nie_dziala;

public class Director {

	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	
	public Zestaw getZestaw() {
		return builder.getZestaw();
	}
	
	public void sk³adaj() {
		builder.buildDrukarka();
		builder.buildKlawiatura();
		builder.buildKomputer();
		builder.buildMonitor();
	}
}
