package decorator;

public class MainApp {

	public static void main(String[] args) {

		Reservable compartment = Compartment.getStandardCompartment();
		compartment.printOffer();
		
		Reservable firstClass = new FirstClassComparatmentDecorator(compartment);
		firstClass.printOffer();
		
		Reservable buissnesClass = new BuissnesClassCompartmentDecorator(compartment);
		buissnesClass.printOffer();
		
		System.out.println("--------------------------");
		
		Reservable comp = new BuissnesClassCompartmentDecorator(new FirstClassComparatmentDecorator(Compartment.getStandardCompartment()));
		comp.printOffer();
		
	}

}
