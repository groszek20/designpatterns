package decorator;

import java.math.BigDecimal;

public class FirstClassComparatmentDecorator extends AbstractCompartmentDecorator {

	public FirstClassComparatmentDecorator(Reservable component) {
		super(component.getCompartment());
		markAsFirstClass();
	}

	@Override
	public void printOffer() {
		compartment.printOffer();
	}
	
	private void markAsFirstClass() {
		compartment.setSeatNumber(6);
		compartment.setWifi(true);
		compartment.setAirCondition(false);
		compartment.setCompartmentClass("1");
		compartment.setPrice(new BigDecimal(15));
	}
}
