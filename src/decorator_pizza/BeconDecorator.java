package decorator_pizza;

public class BeconDecorator extends AbstarctProductDecorator {

	public BeconDecorator(AbstractProduct product) {
		super(product);
	}

	@Override
	public String getDescription() {
		return product.getDescription() + " boczek";
	}

	@Override
	public double price() {
		return product.price() + 4.3;
	}

}
