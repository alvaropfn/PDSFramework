package DAO;

import java.util.ArrayList;

import processing.core.*;
import Domain.Seller;
import Domain.SellerConcret;

public class DAOSellerTXT implements DAOSeller {
	ArrayList<Seller> sellers;
	
	public Seller getSeller(int id)
	{
		for (Seller seller : sellers)
		{
			if(id == seller.getID()) return seller;
		}
		return null;
	}
	
	public ArrayList<Seller> getSellers()
	{
		sellers = new ArrayList<Seller>();
		
		String[] income, line;
		String filename = "C:/Users/Alvaro/Documents/GitHub/PDSFramework/src/Usefull/Sellers.txt";
		
		income = new PApplet().loadStrings(filename);
		
		String name;
		int id;
		String adress;
		
		for (String tmp : income)
		{
			if(tmp.indexOf("#") >=0)continue;
			
			line = PApplet.splitTokens(tmp, ";");
			
			name = line[0];
			id = Integer.parseInt(line[1]);
			adress = line[2];
			
			sellers.add(new SellerConcret(name, id, adress));
		}
		return sellers;
	}

}
