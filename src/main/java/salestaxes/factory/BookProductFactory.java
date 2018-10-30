package salestaxes.factory;

import salestaxes.models.BookProduct;

public class BookProductFactory extends ProductFactory{

	@Override
	public BookProduct createProduct(String name, double price, boolean imported, int quantity) {
		return new BookProduct(name, price, imported, quantity);
	}

}
