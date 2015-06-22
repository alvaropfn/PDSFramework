package Domain;

import java.util.ArrayList;

public abstract class Category
{
	String title;
	private ArrayList<Product> products;
	
	public ArrayList<Product> getProducts()
	{
		return this.products;
	}

}
