package CTRL;

import java.util.ArrayList;

import DAO.DAOProductTXT;
import Domain.Product;

public class Product_W_TXT_CTRL implements CTRLProduct
{
	public ArrayList<Product> getProducts(int sellerID, int categoryID) {
		DAOProductTXT daoP = new DAOProductTXT();
		return daoP.getProducts(sellerID, categoryID);
	}

	public float getPrice(Product p)
	{
		return p.getPrice();
	}

	public String getName(Product p)
	{
		return p.getName();
	}

	public int getCode(Product p)
	{
		return p.getCode();
	}

}
