package Domain;

public abstract class Description
{
	private String title;
	private String content;
	
	public Description(String title, String content)
	{
		this.title = title;
		this.content = content;		
	}
	
	public String geTitle()
	{
		return this.title;
	}
	
	public String getContent()
	{
		return this.content;
	}
	
}
