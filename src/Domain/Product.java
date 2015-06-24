package Domain;

import java.util.ArrayList;

public abstract class Product
{
	private int code;
	private String name;
	private int sellerID;
	private int categoryID;
	private float price;
	private ArrayList<Description> descriptions;
	
	public Product(int code, String name, int sellerID, int categoryID, float price)
	{
		this.code = code;
		this.name = name;
		this.sellerID = sellerID;
		this.categoryID = categoryID;
		this.price = price;
	}
	
	public void attachDescriptions(ArrayList<Description> descriptions)
	{
		this.descriptions = descriptions;
	}
	
	public int getCode()
	{
		return this.code;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * @return preço do produto arredondado para duas casas decimais
	 */
	public float getPrice()
	{
		return ((float) (Math.round(this.price * 100.0)/100.0));
	}
	
	public int getSellerID()
	{
		return this.sellerID;
	}
	
	public int getCategoryID()
	{
		return this.categoryID;
	}
}
