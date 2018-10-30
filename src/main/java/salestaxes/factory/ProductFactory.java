package salestaxes.factory;

import salestaxes.models.Product;

public abstract class ProductFactory {

	/**
	 * Creates a new Product object.
	 *
	 * @param name 			- name of the product
	 * @param price 		- price of product
	 * @param imported 		- boolean value of whether imported or not
	 * @param quantity 		- quantity of product
	 * @return Product
	 */
	public abstract Product createProduct(String name, double price, boolean imported, int quantity);
}
