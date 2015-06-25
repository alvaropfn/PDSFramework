package Usefull;

import java.util.ArrayList;
import Domain.Notice;

public abstract class Observable
{
	ArrayList<Observer> observers;
	
	protected Observable()
	{
		observers = new ArrayList<Observer>();
	}
	
	public void addObserver(Observer o)
	{
		observers.add(o);
	}
	
	public void delObserver(Observer o)
	{
		int index = observers.indexOf(o);
		observers.remove(index);
	}
	
	public void updObservers(Notice n)
	{
		for (Observer observer : observers) {
			observer.beUpdated(n);
		}
	}
}
