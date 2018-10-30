package salestaxes.models;

import salestaxes.factory.GoodProductFactory;
import salestaxes.factory.ProductFactory;

public class GoodProduct  extends Product {

	public GoodProduct() {
		super();
	}
	
	public GoodProduct(String name, double price, boolean imported, int quantity) {
		super(name, price, imported, quantity);
		this.localTax = 0.10f;
	}

	@Override
	public double getTaxPercent() {
		return 0.10f;
	}

	@Override
	public GoodProductFactory getFactory() {
		return new GoodProductFactory();
	}
	

}
