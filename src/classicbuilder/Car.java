package classicbuilder;

public class Car {

	private String engine;
	private String tires;
	
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public void setTires(String tires) {
		this.tires = tires;
	}
	@Override
	public String toString() {
		return "Car [engine=" + engine + ", tires=" + tires + "]";
	}
	
	
	
}
