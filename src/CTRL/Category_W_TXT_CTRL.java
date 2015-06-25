package CTRL;

import java.util.ArrayList;

import DAO.DAOCategoryTXT;
import Domain.Category;

public class Category_W_TXT_CTRL implements CTRLCategory
{
	DAOCategoryTXT daoC;
	public Category getCagetory(int id)
	{
		return daoC.getCagetory(id);
	}

	public ArrayList<Category> getCategories(int sid)
	{
		daoC = new DAOCategoryTXT();
		return daoC.getCategories(sid);
	}
	
}
