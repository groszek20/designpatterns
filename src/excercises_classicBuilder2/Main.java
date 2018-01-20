package excercises_classicBuilder2;

public class Main {

	public static void main(String[] args) {
		Builder budowniczy =  new GraKarciana();
		Director szef = new Director(budowniczy);
		szef.makeZestaw();

		Gra zestaw = budowniczy.getZestaw();
		System.out.println(zestaw);

	}

}
