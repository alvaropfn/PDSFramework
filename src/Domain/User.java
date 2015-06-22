package Domain;
import java.util.ArrayList;

import Patterns.Observer;


public abstract class User implements Observer
{
	private String login;
	private String passw;
	
	private ArrayList<Seller> favoritSellers;
	private ArrayList<Purchase> favoritPurchases;
	private ArrayList<Purchase> scheduledPurchases;
	private ArrayList<Notice> unreadedNotices;
	private ArrayList<Notice> readedNotices;
	
	
}
