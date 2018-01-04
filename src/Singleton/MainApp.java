package Singleton;

public class MainApp {

	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getIstance();
		Singleton singleton2 = Singleton.getIstance();
		
		singleton1.name = "zbyszek";
		singleton2.name = "kote³";
		
		System.out.println(singleton1.name);
		System.out.println(singleton2.name);
		
		Singleton2 singleton22 = Singleton2.INSTANCE;
		Singleton2 singleton23 = Singleton2.INSTANCE;
		
		singleton22.name = "piese³";
		singleton23.name = "pawe³";
		
		System.out.println(singleton22.name);
		System.out.println(singleton23.name);
	}

}
