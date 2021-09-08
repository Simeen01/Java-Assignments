import java.util.*;
class weight
{
	private double pounds;
	
	public double getvalue()
	{
		System.out.print("Enter weight in pounds: ");
		Scanner sc = new Scanner(System.in);
		pounds = sc.nextDouble();
		return pounds;
	}
	
	public double convertToKg()
	{
		double kg;
		kg = pounds * 0.453592;
		return kg;
	}
}

class weightdemo
{
	public static void main (String args[])
	{
		weight w = new weight();
		double result, pounds;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of times you want to find conversion:");
		int times = sc.nextInt();
		
		while(times!=0){
		pounds = w.getvalue();
		result = w.convertToKg();
		System.out.println(pounds+ " Pounds = " +result);
		times--;
		}
	}
}