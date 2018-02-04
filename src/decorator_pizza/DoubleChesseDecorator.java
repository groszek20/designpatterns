package decorator_pizza;

public class DoubleChesseDecorator extends AbstarctProductDecorator{

	public DoubleChesseDecorator(AbstractProduct product) {
		super(product);
	}

	@Override
	public String getDescription() {
		return product.getDescription() + " podwójny ser ";
	}

	@Override
	public double price() {
		return product.price() + 3;
	}

	

}
