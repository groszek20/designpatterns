package decorator_pizza;

public class DoubleChesseDecorator extends AbstarctProductDecorator{

	public DoubleChesseDecorator(AbstractProduct product) {
		super(product);
	}

	@Override
	public String getDescription() {
		return product.getDescription() + " podw�jny ser ";
	}

	@Override
	public double price() {
		return product.price() + 3;
	}

	

}
