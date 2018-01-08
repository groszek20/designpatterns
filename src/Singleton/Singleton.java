package singleton;

public class Singleton {

	public static Singleton instance=null;
	public String name;
	
	private Singleton() {
		System.out.println("Singleton created");
	}

	public static synchronized Singleton getIstance() {
		return (instance == null) ? instance = new Singleton() : instance;
	}
	
	
}
