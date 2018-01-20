package excercises_classicBuilder2;

public class Gra {
	private String instrukcja;
	private String pude³ko;
	
	public void setInstrukcja(String instrukcja) {
		this.instrukcja = instrukcja;
	}
	public void setPude³ko(String pude³ko) {
		this.pude³ko = pude³ko;
	}
	@Override
	public String toString() {
		return "Gra [instrukcja=" + instrukcja + ", pude³ko=" + pude³ko + "]";
	}
	
}
