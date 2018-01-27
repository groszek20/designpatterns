package decorator;

public abstract class AbstractCompartmentDecorator implements Reservable {

	protected Compartment compartment;

	public AbstractCompartmentDecorator(Compartment compartment) {
		this.compartment = compartment;
	}
	
	public Compartment getCompartment() {
		return compartment;
	}
}
