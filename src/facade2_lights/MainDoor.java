package facade2_lights;

public class MainDoor implements Door {

	@Override
	public void open() {
		System.out.println("Main door open.");

	}

	@Override
	public void close() {
		System.out.println("Main door close.");

	}

	@Override
	public void lock() {
		System.out.println("Main door lock.");

	}

	@Override
	public void unloc() {
		System.out.println("Main door unloc.");

	}

}
