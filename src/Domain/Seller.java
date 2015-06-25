package Domain;
import java.util.ArrayList;

import Usefull.Observable;


public abstract class Seller extends Observable
{
	String name;
	int id;
	String adress;
	
	public Seller(String name, int id, String adress)
	{
		this.name = name;
		this.id = id;
		this.adress = adress;
	}
	private ArrayList<Category> categories;
	
	public ArrayList<Category> getCategories()
	{
		return this.categories;
	}
	
	public String getName()
	{
		return this.name;
	}

	public int getID()
	{
		return this.id;
	}
	
	public String getAdress()
	{
		return this.adress;
	}
	
}
