package DAO;

import java.util.ArrayList;
import Domain.Category;

public interface DAOCategory
{
	public Category getCagetory(int id);
	public ArrayList<Category> getCategories(int sid);
}
