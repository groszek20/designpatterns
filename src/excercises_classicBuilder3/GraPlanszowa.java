package excercises_classicBuilder3;

public class GraPlanszowa extends Builder {

	@Override
	public void buildPude�ko() {
		gra.setPude�ko("pude�ko gry planszowej");
		
	}

	@Override
	public void buildInstrukcja() {
		gra.setInstrukcja("instrukcja dla gry planszowej");
	}
	
}
