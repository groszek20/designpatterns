package excercises_classicBuilder3;

public class GraPlanszowa extends Builder {

	@Override
	public void buildPude³ko() {
		gra.setPude³ko("pude³ko gry planszowej");
		
	}

	@Override
	public void buildInstrukcja() {
		gra.setInstrukcja("instrukcja dla gry planszowej");
	}
	
}
