package budowniiczy_data;

public class Main {

	public static void main(String[] args) {
		HeaderDateUtil dateUtil = new HeaderDateUtil.Builder()
				.dateFormatter("dateForm")
				.responseHeaders("responseHeader")
				.build();

		String wynik = dateUtil.calculateHeader();
		System.out.println(wynik);
	}

}
