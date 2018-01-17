package facade2;

public class GarageDoor implements Door {

	@Override
	public void open() {
		System.out.println("Garage Door open.");

	}

	@Override
	public void close() {
		System.out.println("Garage Door close.");

	}

	@Override
	public void lock() {
		System.out.println("Garage Door lock.");

	}

	@Override
	public void unloc() {
		System.out.println("Garage Door unloc.");

	}

}
