package Domain;

import java.util.ArrayList;

import Patterns.Payment;

public abstract class Purchase
{
	int id;
	boolean wasPaid;
	private ArrayList<Product> products;
	
	public ArrayList<Product> getProducts()
	{
		return this.products;
	}
	
	public void pay(Payment paymentMethod)
	{
		paymentMethod.pay(this.getTotal());
	}
	
	public float getTotal()
	{
		float total = 0;
		for (Product product : products)
		{
			total += product.getPrice();
		}
		return total;
	}
	
}
