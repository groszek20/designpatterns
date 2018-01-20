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
	public void buildPude³ko() {
		gra.setPude³ko("pude³ko które zmieœci plansze");
		
	}

	@Override
	public Gra getZestaw() {
		return gra;
	}

}
