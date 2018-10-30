package salestaxes.models;

import salestaxes.factory.MedicalProductFactory;

public class MedicalProduct extends Product {
	
	public MedicalProduct() {
		super();
	}
	
	public MedicalProduct(String name, double price, boolean imported, int quantity) {
		super(name, price, imported, quantity);
	}

	@Override
	public double getTaxPercent() {
		return 0.0f;
	}

	@Override
	public MedicalProductFactory getFactory() {
		return new MedicalProductFactory();
	}
}
