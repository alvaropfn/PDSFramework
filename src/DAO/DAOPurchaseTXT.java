package DAO;

import java.util.ArrayList;
import java.util.Random;

import Domain.Category;
import Domain.Product;
import Domain.Purchase;
import Domain.PurchaseConcret;
import Usefull.Payment;

public class DAOPurchaseTXT implements DAOPurchase
{
	Purchase purchase = new PurchaseConcret(new Random().nextInt());
	
	public void addProduct(Product p)
	{
		purchase.addProduct(p);
	}

	public void edtProduct(Product p, int a)
	{
		purchase.edtProduct(p, a);
	}

	public ArrayList<Product> getProducts()
	{
		return purchase.getProducts();
	}

	public void pay(Payment paymentMethod)
	{
		purchase.pay(paymentMethod);
	}
	
	public float getTotal()
	{
		return purchase.getTotal();
	}

}
