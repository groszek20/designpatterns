package strategia;

public class StringCreator {

	private NamingStrategy namingStrategy;
	
	public StringCreator (NamingStrategy namingStrategy) {
		this.namingStrategy=namingStrategy;
	}
	
	public void printString (String str) {
		System.out.println(namingStrategy.rename(str));
	} 
	
	public void printString (String str, NamingStrategy strategia) {
		System.out.println(strategia.rename(str));
	}
	
	public void printString (NamingStrategy strategia) {
		this.namingStrategy = strategia;
	}
}
