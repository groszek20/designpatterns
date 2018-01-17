package fluentBuilder_Cwiczenia;

public class MainApp {

	public static void main(String[] args) {
		ZestawBuilder nowyZestaw = new ZestawBuilder.Zestaw()
				.setDrukarka("HP")
				.setMonitor("LG")
				.build();

		System.out.println(nowyZestaw);
	}

}
