package DAO;

import java.util.ArrayList;
import Domain.Product;

public interface DAOProduct
{
	public ArrayList<Product> getProducts();
	public float getPrice();
	public String getName();
	public int getCode();
}
