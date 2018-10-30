package salestaxes.factory;

import salestaxes.models.GoodProduct;

public class GoodProductFactory extends ProductFactory{

	@Override
	public GoodProduct createProduct(String name, double price, boolean imported, int quantity) {
		return new GoodProduct(name, price, imported, quantity);
	}

}
