package excercises_classicBuilder3;

public abstract class Builder {

	protected Gra gra;
	
	public void newGra() {
		gra = new Gra();
	}
	
	public Gra getGra() {
		return gra;
	}

	public abstract void buildPudełko();
	public abstract void buildInstrukcja();
}
