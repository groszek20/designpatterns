package decorator2;

public class OponyZimowe extends Dekorator {

	private Samochod samochod;

	OponyZimowe(Samochod samochod) {
		this.samochod = samochod;
	}

	public String about() {
		return samochod.about() + " opony zimowe";
	}

	@Override
	public double cena() {
		return samochod.cena() + 31234;
	}

}
