package classicbuilder;

public class MainApp {

	public static void main(String[] args) {
		CarBuilder carBuilder = new BMWBuilder();
		CarDirector carDirector = new CarDirector(carBuilder);
		carDirector.makeCar();
		
		Car car = carBuilder.getCar();
		System.out.println(car);
	}

}
