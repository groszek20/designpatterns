package decorator2;

public class Fiat extends Samochod {

	public Fiat() {
		samochod = "Fiat";
	}
	
	@Override
	public double cena() {
		return 10000;
	}

}
