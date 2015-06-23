package DAO;

import java.util.ArrayList;

import processing.core.PApplet;
import Domain.Category;

public class DAOCategoryTXT implements DAOCategory
{
	private ArrayList<Category> categories;
	private int sellerID; 
	
	public Category getCagetory(int id)
	{
		
		return null;
	}

	
	public ArrayList<Category> getCategories(int sid)
	{
		
		this.categories = new ArrayList<Category>();
		this.sellerID = sid;
		
		String[] income, line;
		String filename = "C:/Users/Alvaro/Documents/GitHub/PDSFramework/src/DAO/Categories.txt";
		
		income = new PApplet().loadStrings(filename);
		
		String title;
		int id;
		
		for(String tmp : income)
		{
			
			line = PApplet.splitTokens(tmp, ";");
			if(Integer.parseInt(line[2]) == sellerID)
			{
				title = line[0];
				id = Integer.parseInt(line[1]);
				
				categories.add(new Category(title, id, sellerID) {
				});
			}
		}
		return categories;
	}

}
