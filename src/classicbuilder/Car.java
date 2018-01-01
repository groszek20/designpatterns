package classicbuilder;

public class Car {

	private Engine engine;
	private Tires tires;
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void setTires(Tires tires) {
		this.tires = tires;
	}
	@Override
	public String toString() {
		return "Car [engine=" + engine + ", tires=" + tires + "]";
	}
	
	
	
}
