package salestaxes.models;

import salestaxes.factory.FoodProductFactory;

public class FoodProduct extends Product  {
	
	public FoodProduct() {
		super();
	}
	
	public FoodProduct(String name, double price, boolean imported, int quantity) {
		super(name, price, imported, quantity);
	}

	@Override
	public double getTaxPercent() {
		return 0.0f;
	}

	@Override
	public FoodProductFactory getFactory() {
		return new FoodProductFactory();
	}

}
