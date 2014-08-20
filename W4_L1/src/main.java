import java.util.Scanner;

import Ledger.Ledger;


public class main {

	
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Ledger System");
		System.out.println("Menu\n1:Add Sale\n2:Number Of Sales\n3:Totals\n4:Average\n5:Sales Above\n6:Exit");
		String op;
		Ledger Account = new Ledger(10);
		do
		{
			System.out.println(">>");
			op = keyboard.nextLine();
			switch(op)
			{
			//add sale
			case "1":
				//dostuff
				System.out.println("\nEnter Sale");
				if (Err.getValidDouble(keyboard.nextLine()))
				{
					Account.addSale(Err.varDouble);
					System.out.println("it worked");					
				}
				else{}
				
				break;
			//Number of Sales
			case "2":
				System.out.println("The Ledger Contains "+Account.getNumberOfSales()+" Sales");
				break;
			//Sales Totals
			case "3":
				System.out.println("Total Ballance is : $"+round(Account.getTotalSales(),2));
				break;
			case "4":
				System.out.println("Average Sale is : $"+round(Account.getAverageSale(),2));
				break;
			case "5":
				System.out.println("Enter Target Value:");
				if (Err.getValidDouble(keyboard.nextLine()))
				{
					System.out.println("There are :"+Account.getCountAbove(Err.varDouble) + " Entries Over This Limit");
				}
				
				break;
			case "6":
				break;
			default:
				System.out.println("Invalid Entry");
				break;
			
		
			}
		
		}while (!op.equals("6"));
		keyboard.close();
		System.out.println("Exit");
		
		
		
		
		
	}
	
	//prefabricated function i tossed in for pretty formatting
	public static double round(double value, int places) 
	{
		    if (places < 0) throw new IllegalArgumentException();

		    long factor = (long) Math.pow(10, places);
		    value = value * factor;
		    long tmp = Math.round(value);
		    return (double) tmp / factor;
	}
	
}
