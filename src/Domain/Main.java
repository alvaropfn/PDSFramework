package Domain;

import java.io.ObjectInputStream.GetField;

import DAO.DAOCategoryTXT;
import DAO.DAOProduct;
import DAO.DAOProductTXT;
import DAO.DAOSellerTXT;

public class Main {

	boolean isUnix, isWindows, isMac;
	public static void main(String[] args) 
	{
		
		
		
	}
	void checkDAOS()
	{
		//sellers test
		DAOSellerTXT daoS = new DAOSellerTXT();
		for (Seller s : daoS.getSellers())
		{
			//System.out.println(s.getName() + ";" + s.getID() +";" + s.getAdress());
		}
		
		//categories test
		DAOCategoryTXT daoC = new DAOCategoryTXT();
		for (Category c : daoC.getCategories(0))
		{
			//System.out.println(c.getTitle() + ";" + c.getID() +";" + c.getSellerID());
		}
		
		//products test
		DAOProductTXT daoP = new DAOProductTXT();
		for (Product p : daoP.getProducts(0,0))
		{
			System.out.println(p.getCode() + ";" + p.getName() +";" + p.getSellerID() + ";" + p.getCategoryID() +";" + p.getPrice());
		}
	}
	void checkOS()
	{
		String os = System.getProperty("os.name").toLowerCase();
		if(os.indexOf("nix") >= 0)
		{
			System.out.println("is a Unix");
			isUnix = true;
		}
		else if(os.indexOf("win") >= 0)
		{
			System.out.println("is a Windows");
			isWindows = true;
		}
		else if(os.indexOf("mac") >= 0)
		{
			System.out.println("is  Mac OS");
			isMac = true;
		}
	}

}
