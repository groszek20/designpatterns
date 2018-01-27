package decorator;

import java.math.BigDecimal;

public class Compartment implements Reservable{
	private int seatNumber;
	private boolean airCondition;
	private boolean wifi;
	private BigDecimal price;
	private String compartmentClass;

	private Compartment(int seatNumber, boolean airCondition, boolean wifi, BigDecimal price, String compartmentClass) {
		this.seatNumber = seatNumber;
		this.airCondition = airCondition;
		this.wifi = wifi;
		this.price = price;
		this.compartmentClass = compartmentClass;
	}
	
	public static Compartment getStandardCompartment() {
		return new Compartment (8, false, false, new BigDecimal(10.50),"2");
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public boolean isAirCondition() {
		return airCondition;
	}

	public void setAirCondition(boolean airCondition) {
		this.airCondition = airCondition;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getCompartmentClass() {
		return compartmentClass;
	}

	public void setCompartmentClass(String compartmentClass) {
		this.compartmentClass = compartmentClass;
	}

	@Override
	public void printOffer() {
		System.out.println("Mniejsca w klasie " + getCompartmentClass());
		System.out.println("£¹cznie miejsc w przedziale: " + getSeatNumber());
		System.out.println(isWifi() ? "dostêp do wifi" : "");
		System.out.println("Cena biletu" + getPrice());
		System.out.println(isAirCondition() ? "przedzia³ klimatysowany" : "");
		System.out.println();
		
	}

	@Override
	public Compartment getCompartment() {
		return this;
	} 
	
	

}
