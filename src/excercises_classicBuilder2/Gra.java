package excercises_classicBuilder2;

public class Gra {
	private String instrukcja;
	private String pude�ko;
	
	public void setInstrukcja(String instrukcja) {
		this.instrukcja = instrukcja;
	}
	public void setPude�ko(String pude�ko) {
		this.pude�ko = pude�ko;
	}
	@Override
	public String toString() {
		return "Gra [instrukcja=" + instrukcja + ", pude�ko=" + pude�ko + "]";
	}
	
}
