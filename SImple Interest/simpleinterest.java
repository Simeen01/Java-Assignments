import java.util.*;
class SInterest
{
	private double principle;
	private double years;
	private double rate;
	
	public void getvalue()
	{
		//accept the value of principle,years,rate
		System.out.print("\nEnter the principle: ");
		Scanner sc = new Scanner(System.in);
		principle = sc.nextDouble();
	    System.out.print("Enter the number of years: ");
	    years = sc.nextDouble();
		System.out.print("Enter the rate: ");
		rate = sc.nextDouble();
	}
	
	public double calculate()
	{
		double calc;  //calc will calculate the simple interest
		calc = (principle*years*rate)/100;
		return calc;
	}
}

class simpleInterest
{
	public static void main(String args[])
	{
		SInterest SI = new SInterest();
		
		//number of times the user wants to find simple interest
		Scanner sc = new Scanner(System.in);
		System.out.println("How many times do you want to find simple interest?");
		int times = sc.nextInt();
		
		while(times!=0)
		{
			SI.getvalue();
			double result = SI.calculate();
			System.out.println("\nSimple Interest: " +result);
			System.out.println("-----------------------------");
			times--;
		}
		
	}
}