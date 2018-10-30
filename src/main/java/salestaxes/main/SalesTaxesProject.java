package salestaxes.main;

import java.util.ArrayList;
import java.util.List;

import salestaxes.models.BookProduct;
import salestaxes.models.FoodProduct;
import salestaxes.models.GoodProduct;
import salestaxes.models.MedicalProduct;
import salestaxes.models.Product;

public class SalesTaxesProject {
	public static void main(String[] args) {
		
		SalesTaxesProject.loadSample1();
		SalesTaxesProject.loadSample2();
		SalesTaxesProject.loadSample3();
		
	}
	
	public static void loadSample1() {
		Product book = new BookProduct("Book",12.49,false, 1);
		Product musicCd = new GoodProduct("music CD",14.99,false, 1);
		Product chocolate = new FoodProduct("chocolate bar",0.85,false, 1);
		List<Product> list = new ArrayList<Product>();
		list.add(book);
		list.add(musicCd);
		list.add(chocolate);
		for (Product p : list) {
			System.out.println(p.toString());
			System.out.println(p.getCalculatedTax());
			System.out.println(p.getTax());			
		}		
	}
	
	public static void loadSample2() {
		Product chocolate = new FoodProduct("box of chocolates",10.00,true, 1);
		Product perfume = new GoodProduct("bottle of perfume",47.50,true, 1);
		List<Product> list = new ArrayList<Product>();
		list.add(chocolate);
		list.add(perfume);
		for (Product p : list) {
			System.out.println(p.toString());
			System.out.println(p.getCalculatedTax());
			System.out.println(p.getTax());			
		}		
	}
	
	public static void loadSample3() {
		Product perfume1 = new GoodProduct("bottle of perfume",27.99,true, 1);
		Product perfume2 = new GoodProduct("bottle of perfume",18.99,false, 1);
		Product pill = new MedicalProduct("packet of headache pills",9.75,false, 1);
		Product chocolate = new FoodProduct("box of chocolates",11.25,true, 1);
		List<Product> list = new ArrayList<Product>();
		list.add(perfume1);
		list.add(perfume2);
		list.add(pill);
		list.add(chocolate);
		for (Product p : list) {
			System.out.println(p.toString());
			System.out.println(p.getCalculatedTax());
			System.out.println(p.getTax());			
		}		
	}
}