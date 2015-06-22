package Domain;
import java.util.ArrayList;

import Patterns.Observable;


public abstract class Seller extends Observable
{
	String name;
	String adress;
	private ArrayList<Category> categories;
	
	public ArrayList<Category> getCategories()
	{
		return this.categories;
	}
	
}
