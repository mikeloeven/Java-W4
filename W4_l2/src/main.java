import org.omg.CORBA.portable.ValueOutputStream;


public class main 
{
	
	
	
	
	//Output function
	public static void printArr(boolean[] arr)
	{
		for(boolean i : arr)
		{
			System.out.println(i);
		}
	}
	
	public static void main (String[] args)
	{
		boolean[] Lockers = new boolean[100];
		
		
		for(int outerloop=0;outerloop<Lockers.length;outerloop++)
		{
			int innerincriment =outerloop+1;
			for (int innerloop=outerloop;innerloop<Lockers.length;innerloop+=innerincriment)
			{
				Lockers[innerloop]^=true;
			}
			System.out.println("Student "+(outerloop+1)+" Pass");
			printArr(Lockers);
		}
		System.out.println("ALL STUDENTS PROCESSED\n The opened Lockers Are :");
		for(int i=0;i<Lockers.length;i++)
		{
			if(Lockers[i]==true)System.out.println(i);
		}
		
		
		
		
		
		
		
	}

	
		
		
		
}


