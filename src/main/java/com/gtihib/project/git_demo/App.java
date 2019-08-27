package com.gtihib.project.git_demo;

public class App 
{
	
	public void addData(String data)
	{
		if(data.equalsIgnoreCase(Constatnt.data))
		{
			System.out.println("Test Pass-2");
		}
	}
	
	public void newMeyhod()
	{
		System.out.println("New Method");	
	}	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
