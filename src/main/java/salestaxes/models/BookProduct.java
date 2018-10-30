package salestaxes.models;

import salestaxes.factory.BookProductFactory;

public class BookProduct extends Product {

	public BookProduct() {
		super();
	}
	
	public BookProduct(String name, double price, boolean imported, int quantity) {
		super(name, price, imported, quantity);
	}

	@Override
	public double getTaxPercent() {
		return 0.0f;
	}

	@Override
	public BookProductFactory getFactory() {
		return new BookProductFactory();
	}

}
