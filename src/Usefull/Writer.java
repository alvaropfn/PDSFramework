package Usefull;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import processing.core.PApplet;


public class Writer
{
	PApplet dad;
	public Writer()
	{
		this.dad = new PApplet();
	}
	
	 public void overWrite(String name, String[] content)
	    {    

	        dad.saveStrings(name, content);
	    }

	    public void writeAt(String name, String content)
	    {
	        
	        File f = new File(dad.dataPath(name));
	        if (!f.exists())
	        {
	             createFile(f);
	        }
	        try
	        {
	            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(f, true)));
	            out.println(content);
	            out.close();
	        }
	        catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	    }

	/**
	 * Creates a new file including all subfolders
	 */
	    private void createFile(File f)
	    {
	        File parentDir = f.getParentFile();
	        try 
	        {
	            parentDir.mkdirs(); 
	            f.createNewFile();
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	        }
	    }
}
