package classicbuilder;

public class CarDirector {

	private CarBuilder carBuilder;
	
	public CarDirector(CarBuilder carBuilder) {
		this.carBuilder = carBuilder;
	}
	
	public void makeCar() {
		carBuilder.buildEngine();
		carBuilder.buildTires();
	}
	
	public Car getCar() {
		return carBuilder.getCar();
	}
}
