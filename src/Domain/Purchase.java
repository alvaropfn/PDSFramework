package Domain;

import java.util.ArrayList;

import Usefull.Payment;

public abstract class Purchase
{
	int id;
	boolean wasPaid;
	private ArrayList<Product> products;
	private ArrayList<Integer> amount;
	
	public Purchase(int id)
	{
		this.id = id;
	}
	
	public void addProduct(Product p)
	{
		if(products.isEmpty())
		{
			products = new ArrayList<Product>();
			amount = new ArrayList<Integer>();
		}
		
		if(products.contains(p))
		{
			int index = products.indexOf(p);
			int element = amount.get(index);
			amount.set(index, element+ 1);
		}
		else
		{
			products.add(p);
			amount.add(1);
		}
	}
	
	public void edtProduct(Product p, int a)
	{
		int index = products.indexOf(p);
		int element = amount.get(index);
		amount.set(index, element + a);
	}
	
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
		int i = 0;
		for (Product product : products)
		{
			total += product.getPrice()* amount.get(i);
			i++;
		}
		return total;
	}
	
}
