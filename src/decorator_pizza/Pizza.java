package decorator_pizza;

class Pizza extends AbstractProduct{

	public Pizza() {
		description = "podstawowa pizza";
	}
	
	@Override
	public double price() {
		return 15.00;
	}

}
