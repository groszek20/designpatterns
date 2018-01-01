package classicbuilder;

public class BMWBuilder implements CarBuilder {

	private Car car;
	
	public BMWBuilder() {
		this.car = new Car();
	}
	
	@Override
	public void buildTires() {
		Tires tire = new Tires();
		tire.setType("Sliks");
		tire.setDurability(50);
		car.setTires(tire);
	}

	@Override
	public void buildEngine() {
		Engine engine = new Engine();
		engine.setType("R6");
		car.setEngine(engine);		
	}

	@Override
	public Car getCar() {
		return car;
	}

}
