package classicBuilder2_ktory_nie_dziala;

public class Zestaw {

	private String monitor;
	private String komputer;
	private String klawiatura;
	private String drukarka;
	
	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}
	public void setKomputer(String komputer) {
		this.komputer = komputer;
	}
	public void setKlawiatura(String klawiatura) {
		this.klawiatura = klawiatura;
	}
	public void setDrukarka(String drukarka) {
		this.drukarka = drukarka;
	}
	
	public void pokazZestaw() {
		System.out.println("Monitor: " + monitor);
		System.out.println("Komputer: " + komputer);
		System.out.println("Klawiatura: " + klawiatura);
		System.out.println("Drukarka: " + drukarka);
	}
	
}
