package decorator2;

public class Klimatyzacja extends Dekorator{
	private Samochod samochod;

	public Klimatyzacja(Samochod samochod) {
		this.samochod = samochod;
	}
	
	public String about() {
		return samochod.about() + " klimatyzacja";
	}
	
	@Override
	public double cena() {
		if(samochod instanceof Mercedes) {
			return samochod.cena() + 10000;
		} else if (samochod instanceof Fiat){
			return samochod.cena() + 5000;
		}
		return 0;
	}

}
