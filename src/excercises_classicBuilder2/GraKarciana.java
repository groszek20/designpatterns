package excercises_classicBuilder2;

public class GraKarciana implements Builder {

	private Gra gra;
	
	public GraKarciana() {
		this.gra = new Gra();
	}
	
	@Override
	public void buildInstrukcja() {
		gra.setInstrukcja("instrukcja gry planszowej");
	}

	@Override
	public void buildPude�ko() {
		gra.setPude�ko("pude�ko kt�re zmie�ci plansze");
		
	}

	@Override
	public Gra getZestaw() {
		return gra;
	}

}
