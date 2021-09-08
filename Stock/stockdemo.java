import java.util.*;
class stock
{
	private String stock_symbol;
	private String company_name;
	private double previousClosingPrice;
	private double currentPrice;
	
	public void getvalue()
	{
		System.out.print("Enter the Stock Symbol: ");
		Scanner sc = new Scanner(System.in);
		stock_symbol = sc.nextLine();
		
		System.out.print("Enter the Company Name: ");
		company_name = sc.nextLine();
		
		System.out.print("Enter the Previous Closing Price: ");
		previousClosingPrice = sc.nextDouble();
		
		System.out.print("Enter the Current Price: ");
		currentPrice = sc.nextDouble();
	}
	
	public void display()
	{
		System.out.println("\nStock Symbol: " +stock_symbol);
		System.out.println("Company Name: " +company_name);
		System.out.println("Previous Closing Price: " +previousClosingPrice);
		System.out.println("Current Price: " +currentPrice);
	}
	
	public double getChangepercent()
	{
		double change, percentChange;
		change =  previousClosingPrice - currentPrice;
		
		percentChange = change / previousClosingPrice * 100;
		return percentChange;
	}
}

class stockdemo
{
	public static void main(String args[])
	{
		stock s1 = new stock();
		Scanner sc = new Scanner(System.in);
		
		//menu
		System.out.println("******Menu******");
		System.out.println("1. Insert Values \n2. Display \n3. Get Percentage Change \n0. Quit");
		boolean quit = false;
		int choice;
            do  {
                  System.out.print("\nChoose menu item: ");
                  choice = sc.nextInt();
                  switch (choice) 
				  {
                  case 1:
				  s1.getvalue();
				  break;
				  
				  case 2:
				  s1.display();
				  break;
		
		          case 3:
				  double result;
				  result = s1.getChangepercent();
				  System.out.println("Percentage Change: " +result);
				  break;
				  
				  case 0:
				  quit = true;
                  break;

                  default:
                        System.out.println("Invalid choice!");
                  }

				} while (!quit);
	}
}