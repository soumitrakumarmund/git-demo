package com.gtihib.project.git_demo;

public class App 
{
	
	public void addData(String data)
	{
		if(data.equalsIgnoreCase(Constatnt.data))
		{
			System.out.println("Test Pass");
		}
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
