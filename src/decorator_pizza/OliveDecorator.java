package decorator_pizza;

public class OliveDecorator extends AbstarctProductDecorator {

	public OliveDecorator(AbstractProduct product) {
		super(product);
	}

	@Override
	public String getDescription() {
		return product.getDescription() + " oliwki ";
	}

	@Override
	public double price() {
		return product.price() + 2.5;
	}

}
