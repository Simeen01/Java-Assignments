import java.util.*;
class account
{
	private String depositor_name;
	private static int acc_no=1; 
	private boolean acc_type;
	private double balance_amount = 50 ;
	private double annualInterestRate;
	
	Scanner ab = new Scanner(System.in);
	
	//initializing using constructor
	public account()
	{
		depositor_name="";
		acc_no = 1;
		acc_type = false;
		balance_amount = 50.0;
		annualInterestRate =0.0;
	}
	
	public void getvalue()
	{
		System.out.print("Enter the name of the depositor: ");
		depositor_name = ab.nextLine();
		System.out.print("Enter the Account Number: ");
		acc_no = ab.nextInt();
		System.out.print("Enter the Account Type (Enter true for Saving and false for Current): ");
		acc_type = ab.nextBoolean(); 
		System.out.print("Enter the balance amount: ");
		balance_amount = ab.nextDouble();
		System.out.print("Enter the Annual Interest Rate: ");
		annualInterestRate = ab.nextDouble();
	}	
	
	public boolean acc_type()
	{
		return acc_type;
	}
	
	
	
	public void setacc_type(boolean acc_type)
	{
		this.acc_type = acc_type;
		System.out.println("Account Type: " +this.acc_type);
	}
	
	public void deposit() {
		long amount;
        System.out.print("Enter amount to be deposited: ");
        amount = ab.nextLong();
		if (amount <= 0){
			System.out.println("Can't deposit nonpositive amount.");
		}
        else {
            balance_amount += amount;
            System.out.println("Rs." + amount + " has been deposited.");
        }
    }
	
	public void withdrawal() {
        long amount;
        System.out.print("Enter amount to be withdrawn: ");
        amount = ab.nextLong();
		if (balance_amount > 50) 
		{
            balance_amount = balance_amount - amount;
			System.out.println("Rs." + amount + "has been withdrawn.");
        } 
		else{
			System.out.println("Oops!! Transaction Failed..");
		}
    }
	
	public void display()
	{
		System.out.println("Name of Depositor: " +depositor_name);
		System.out.println("Account Number: " +acc_no);
		
		String account_type;
		if(acc_type())
			account_type = "Saving"; //true
		else
			account_type = "Current"; //false
		
		System.out.println("Type of Account: " +account_type);
		System.out.println("Balance Amount: " +balance_amount);
		System.out.println("Annual Interest Rate: " +annualInterestRate);
	}
	
	public double Get_Monthly_intrestRate()
	{
		double monthlyintrate = annualInterestRate/12;
		return monthlyintrate;
	}
	
	public double Get_Monthly_intrest(double monthlyintrate)
	{
		return (balance_amount * monthlyintrate);
	} 
}

class accountdemo
{
	public static void main (String args[])
	{
		account acc1 = new account();
		Scanner ab = new Scanner(System.in);
		
		//menu
		System.out.println("\n******Menu******");
		System.out.println("1. Add Account \n2. Display Account \n3. Deposit \n4. Withdrawl \n5. Monthly Interest Rate \n0. Quit");
		boolean quit = false;
		int choice;
            do {
                  System.out.print("\nChoose menu item: ");
                  choice = ab.nextInt();
                  switch (choice) 
				  {
                  case 1:
				  acc1.getvalue();
				  break;
				  
				  case 2:
				  acc1.display();
				  break;
				  
				  case 3:
				  acc1.deposit();
				  break;
				  
				  case 4:
				  acc1.withdrawal();
				  break;

				  case 5:
				  double result1, result2;
				  result1 = acc1.Get_Monthly_intrestRate();
				  System.out.println("Monthly Interest Rate: " +result1);
				  result2 = acc1.Get_Monthly_intrest(result1); 
				  System.out.println("Monthly Interest: " +result2);
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