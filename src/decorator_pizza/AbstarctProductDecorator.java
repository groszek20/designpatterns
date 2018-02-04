package decorator_pizza;

abstract class AbstarctProductDecorator extends AbstractProduct {

	protected AbstractProduct product;
	
	public AbstarctProductDecorator(AbstractProduct product) {
		this.product = product;
	}
	
	@Override
	public abstract String getDescription();

}
