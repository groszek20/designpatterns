package facade2_lights;

public class Main {

	public static void main(String[] args) {
		Facade mainApi = new Facade();
		mainApi.lockHome();
		mainApi.unlocHome();
		mainApi.lightOff();
		mainApi.lightOn();

	}

}
