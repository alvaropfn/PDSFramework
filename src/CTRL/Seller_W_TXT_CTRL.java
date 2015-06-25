package CTRL;

import java.util.ArrayList;

import DAO.DAOSellerTXT;
import Domain.Seller;

public class Seller_W_TXT_CTRL implements CTRLSeller {

	DAOSellerTXT daoS;
	public ArrayList<Seller> getSellers()
	{
		daoS = new DAOSellerTXT();
		return daoS.getSellers();
	}

	public Seller getSeller(int id) {
		return daoS.getSeller(id);
	}
}
