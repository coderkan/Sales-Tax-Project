package salestaxes.billing;

import java.util.List;

import salestaxes.models.Product;

public class Receipt {
	
	private List<Product> productList;
	
	private double totalProductSalesTax;
	
	private double totalProductAmount;
	
	public Receipt(List<Product> prod, double tax, double amount)
	{
		productList = prod;
		totalProductSalesTax = tax;
		totalProductAmount = amount;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public double getTotalProductSalesTax() {
		return totalProductSalesTax;
	}

	public void setTotalProductSalesTax(double totalProductSalesTax) {
		this.totalProductSalesTax = totalProductSalesTax;
	}

	public double getTotalProductAmount() {
		return totalProductAmount;
	}

	public void setTotalProductAmount(double totalProductAmount) {
		this.totalProductAmount = totalProductAmount;
	}
	
	@Override
	public String toString() {
		
		String receipt = "";
		for(Product p: productList) {
			receipt += (p.toString() + " \n");
		}
		
		receipt = "Total sales tax = " + this.totalProductSalesTax + " \n";
		receipt = "Total amount = " + this.totalProductAmount + " \n";
		
		return receipt;
	}
	
}
