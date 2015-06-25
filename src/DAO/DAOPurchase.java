package DAO;

import java.util.ArrayList;

import Domain.Product;
import Usefull.Payment;

public interface DAOPurchase
{
	public void addProduct(Product p);
	
	public void edtProduct(Product p, int a);
	public ArrayList<Product> getProducts();
	public void pay(Payment paymentMethod);
	public float getTotal();
}
