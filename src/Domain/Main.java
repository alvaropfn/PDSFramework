package Domain;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		String os = System.getProperty("os.name").toLowerCase();
		if(os.indexOf("nix") >= 0)System.out.println("is a Unix");
		if(os.indexOf("win") >= 0)System.out.println("is a Windows");
		if(os.indexOf("mac") >= 0)System.out.println("is  Mac OS");
			
	}

}
