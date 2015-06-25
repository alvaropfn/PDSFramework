package DAO;

import java.util.ArrayList;

import processing.core.PApplet;
import Domain.Product;
import Domain.ProductConcret;

public class DAOProductTXT implements DAOProduct
{
	ArrayList<Product> products;

	public ArrayList<Product> getProducts(int sellerID, int categoryID)
	{
		products = new ArrayList<Product>();
		
		String[] income, line;
		String filename = "C:/Users/Alvaro/Documents/GitHub/PDSFramework/src/Usefull/Products.txt"; 
		
		income = new PApplet().loadStrings(filename);
		
		int code;
		String name;
		float price;
		
		for(String tmp : income)
		{
			if(tmp.indexOf("#") >=0)continue;
			
			line = PApplet.splitTokens(tmp,";");
			
			if(Integer.parseInt(line[2]) != sellerID) continue;
			else if(Integer.parseInt(line[3]) != categoryID) continue;
			else
			{
				code = Integer.parseInt(line[0]);
				name = line[1];
				price = Float.parseFloat(line[4]);
				products.add(new ProductConcret(code, name, sellerID, categoryID, price));
			}
			
		}		
		return products;
	}

	public float getPrice(Product p) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getName(Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getCode(Product p) {
		// TODO Auto-generated method stub
		return 0;
	}

}
