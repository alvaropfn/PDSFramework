package DAO;

import java.util.ArrayList;

import Domain.Seller;

public interface DAOSeller
{
	public Seller getSeller(int id);
	public ArrayList<Seller> getSellers();
	
}
