package fluentbuilder;

public class MainApp {

	public static void main(String[] args) {
		Car fiat = new Car.Builder("czerwony").
				name("Fiat").
				age(10).
				build();
		
		System.out.println(fiat);
	}

}
