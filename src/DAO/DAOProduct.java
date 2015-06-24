package DAO;

import java.util.ArrayList;
import Domain.Product;

public interface DAOProduct
{
	public ArrayList<Product> getProducts(int sellerID, int categoryID);
	public float getPrice(Product p);
	public String getName(Product p);
	public int getCode(Product p);
}
