package excercises_classicBuilder3;

public class Main {

	public static void main(String[] args) {
		Builder budowniczy = new GraPlanszowa();
		Director szef = new Director();		
		szef.setBuilder(budowniczy);
		szef.sk³adajGre();
		
		Gra gra = szef.getGra();
		System.out.println(gra);
		

	}

}
