package Domain;

import java.util.ArrayList;

public abstract class Category
{
	String title;
	int id;
	int selllerID;
	private ArrayList<Product> products;
	
	public Category(String title, int id, int idSeller)
	{
		this.title = title;
		this.id = id;
		this.selllerID = idSeller;
	}
	
	public ArrayList<Product> getProducts()
	{
		return this.products;
	}
	
	public String getTitle()
	{
		return title;
	}

	public int getID()
	{
		return id;
	}

	public int getSellerID()
	{
		return selllerID;
	}

}
