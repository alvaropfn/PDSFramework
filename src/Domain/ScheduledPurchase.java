package Domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class ScheduledPurchase extends Purchase {
	Date agendedDate;
	SimpleDateFormat sdf;
	
	protected ScheduledPurchase()
	{
		this.sdf = new SimpleDateFormat("YYYY/MM/ff");
	}
	
}
