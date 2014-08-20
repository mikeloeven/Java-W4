import java.util.Scanner;


public class Err {
	//Input Based Error Handling
	public static double varDouble;
	public static int varInt;
	public static String varString;
	
	
	public static boolean getValidInt(String input)
	{
		try 
		{
		varInt=Integer.parseInt(input);
		return true;
		}
		catch(Exception e)
		{
			System.out.println("Invalid Int");
			return false;
		}
	}
	
	public static boolean getValidDouble(String input)
	{
		try 
		{
		varDouble=Double.parseDouble(input);
		return true;
		}
		catch(Exception e)
		{
			System.out.println("Invalid Double");
			return false;
		}
	}
	
	

}
