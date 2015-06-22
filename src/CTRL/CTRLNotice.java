package CTRL;

public interface CTRLNotice
{
	
	public String getNotice(int index);
	public String getLastNotice();
	
	public void markHasUnreaded();
	public void markHasReaded();
	public void clearNotices();
	
}
