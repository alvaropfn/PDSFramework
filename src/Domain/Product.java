package Domain;

import java.util.ArrayList;

public abstract class Product
{
	private int code;
	private String name;
	private float price;
	private ArrayList<Description> descriptions;
	
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
}
