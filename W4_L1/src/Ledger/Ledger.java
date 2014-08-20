package Ledger;

public class Ledger{
	
/*
 * CLASS VARS
 */
	private double[] sales;
	private static int salesMade = 0;
/*
 * CONSTRUCTORS
 */
	public Ledger()
	{
		this.sales=new double[10];
	}
	public Ledger(int maxSales)
	{
		this.sales=new double[maxSales];
	}
	
/*
 * METHODS
 */
	
	//add a sale to array
	public void addSale(double d)
	{
		//debugging info
		/*
		System.out.println(sales.length);
		System.out.println(salesMade);
		*/
		//prevents index errors in array
		if(salesMade>(sales.length-1))
		{
			System.out.println("Ledger Is Full, Value Has Not Been Saved");
		}
		else
		{
		this.sales[salesMade]=d;
		salesMade++;
		}
	}
	//lists total sales
	public int getNumberOfSales()
	{
		return (salesMade);
	}
	//returns the total of all sales
	public double getTotalSales()
	{
		double total = 0.0;
		for(double i : sales)
		{
			total+=i;
		}
		return total;
	}
	//returns the average of all sales
	public double getAverageSale()
	{
		double avg = this.getTotalSales()/this.salesMade;
		return avg;
	
	}
	//gets the number of values above target
	public int getCountAbove(double target)
	{
		int above=0;
		for(double i : sales)
		{
			if (i>target)
			{
				above ++;
			}
		}
		return above;
	}
	
	
	//returns max size of array
	public int getLedgerMax()
	{
		int size = sales.length;
		return size;
	}
	
	

}