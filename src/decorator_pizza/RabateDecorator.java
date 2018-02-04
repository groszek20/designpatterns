package decorator_pizza;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class RabateDecorator extends AbstarctProductDecorator {

	private int rabatePercent;
	
	public RabateDecorator(int rabatePercent, AbstractProduct product) {
		super(product);
		this.rabatePercent = rabatePercent;
	}

	@Override
	public String getDescription() {
		BigDecimal rebate = BigDecimal.valueOf(product.price());
        rebate = rebate.subtract(BigDecimal.valueOf(price()));
        return product.getDescription() + ", rabat " + rabatePercent + "% (" + rebate.toString() + ")";
	}

	@Override
	public double price() {
		BigDecimal price = BigDecimal.valueOf(product.price()).setScale(2);
        BigDecimal discount = BigDecimal.valueOf(rabatePercent / 100.0).setScale(2);
        discount = discount.multiply(price);
        price = price.subtract(discount).round(new MathContext(3, RoundingMode.HALF_UP)).setScale(2);
        return price.doubleValue();
	}

}
