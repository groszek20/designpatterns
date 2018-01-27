package decorator2;

public class Mercedes extends Samochod{

	public Mercedes() {
		samochod = "Mercedes";
	}
	
	@Override
	public double cena() {
		return 500000;
	}

}
