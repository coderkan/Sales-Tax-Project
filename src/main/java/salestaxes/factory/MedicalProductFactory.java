package salestaxes.factory;

import salestaxes.models.MedicalProduct;

public class MedicalProductFactory extends ProductFactory{

	@Override
	public MedicalProduct createProduct(String name, double price, boolean imported, int quantity) {
		return new MedicalProduct(name, price, imported, quantity);
	}

}
