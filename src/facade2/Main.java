package facade2;

public class Main {

	public static void main(String[] args) {
		MainApi mainApi = new MainApi();
		mainApi.lockHome();
		mainApi.unlocHome();
		mainApi.lightOff();
		mainApi.lightOn();

	}

}
