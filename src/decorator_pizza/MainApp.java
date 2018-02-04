package decorator_pizza;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {

		AbstractProduct pizza;
		List<AbstractProduct> orders = new ArrayList<>();

		pizza = new Pizza();
		orders.add(pizza);

		pizza = new Pizza();
		pizza = new DoubleChesseDecorator(pizza);
		orders.add(pizza);

		pizza = new Pizza();
		pizza = new DoubleChesseDecorator(pizza);
		pizza = new OliveDecorator(pizza);
		pizza = new BeconDecorator(pizza);
		orders.add(pizza);

		orders.forEach(order -> System.out.println(order));
	}

}
