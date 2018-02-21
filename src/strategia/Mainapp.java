package strategia;

public class Mainapp {

	public static void main(String[] args) {
		
	NamingStrategy ns = new SufixNammingStrategy();
	
	StringCreator sc = new StringCreator(ns);
	sc.printString("dupa");

	}

}
