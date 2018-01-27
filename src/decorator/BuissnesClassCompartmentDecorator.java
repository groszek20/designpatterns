package decorator;

import java.math.BigDecimal;

public class BuissnesClassCompartmentDecorator extends AbstractCompartmentDecorator {

	
	public BuissnesClassCompartmentDecorator(Reservable component) {
		super(component.getCompartment());
		markAsFirstClass();
	}

	@Override
	public void printOffer() {
		compartment.printOffer();
	}

	private void markAsFirstClass() {
		compartment.setSeatNumber(4);
		compartment.setWifi(true);
		compartment.setAirCondition(true);
		compartment.setCompartmentClass("1 Biznes");
		compartment.setPrice(new BigDecimal(25));
	}
}
