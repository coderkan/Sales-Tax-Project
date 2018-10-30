package salestaxes.models;

import salestaxes.factory.ProductFactory;
import salestaxes.helpers.MathHelper;
import salestaxes.taxes.Tax;

public abstract class Product implements Tax{
	
	/** name -  name of Product*/
	protected String name;
	protected boolean imported;
	protected int quantity;
	protected double price;
	protected double taxedPrice;
	protected double localTax = 0.0f;
	
	/**
	 * Default Constructor
	 * */
	public Product() {
		this.name = "";
		this.imported = false;
		this.quantity = 0;
		this.price = 0.0f;
		this.taxedPrice = 0.0f;
	}
	
	/**
	 * Constructor with parameter
	 * initialize the values of Product values.
	 * 
	 * @param name 			- the name of the product
	 * @param price 		- the price of the product
	 * @param imported 		- boolean value of whether product imported or not
	 * @param quantity 		- quantity of product item
	 * 
	 * */
	public Product(String name, double price, boolean imported, int quantity) {
		setName(name);
		setPrice(price * (double)quantity);
		setImported(imported);
		setQuantity(quantity);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isImported() {
		return imported;
	}

	public void setImported(boolean imported) {
		this.imported = imported;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTaxedPrice() {
		return taxedPrice;
	}

	public void setTaxedPrice(double taxedPrice) {
		this.taxedPrice = taxedPrice;
	}
	
	@Override
	public String toString() {
		return (quantity + " " + ((this.imported) ? "imported" : " ") + " " + name + " at " + price);
	}

	public abstract ProductFactory getFactory();
	public abstract double getTaxPercent();

	@Override
	public double getCalculatedTax() {
		double tax = this.price * this.localTax;
		
		if(this.imported) {
			tax += (this.price * 0.05f);
		}
		this.taxedPrice = this.price + MathHelper.roundPrice(tax);
		this.taxedPrice = MathHelper.nearest5Percent(this.taxedPrice); //MathHelper.truncate(this.taxedPrice);
		return this.taxedPrice;
	}
	
	@Override
	public double getTax() {
		double tax = this.price * this.localTax;
		
		if(this.imported) {
			tax += (this.price * 0.05f);
		}
		tax = MathHelper.roundPrice(tax);
		tax = MathHelper.nearest5Percent(tax);
		//tax = MathHelper.roundOff(tax);
		//tax = MathHelper.truncate(tax);
		return tax;
	}
}
