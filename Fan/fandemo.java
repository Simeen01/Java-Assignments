import java.util.*;
class fan
{
	static final int Slow = 1; //constant
	static final int Medium = 2; //constant
	static final int Fast = 3; //constant
	private int speed = Slow;  //speed of fan
	private boolean fan_on = false; //whether fan is switched on or off
	private double radius = 5; //radius of fan
    private String color = "Blue"; //color of fan

    //creating default constructor
	fan()
	{
	speed = 0;
	fan_on = false;
	radius = 0.0;
	color = "";
	}	
	
	//description of fan
	public String toString()
	{
		String fan_status;
		if(fan_on())
			fan_status = "Switched On"; //true
		else
			fan_status = "Switched Off"; //false
		
		if (fan_on)
		{
			return("Fan Speed: " +this.getspeed() +"\nColor: " +this.getcolor() +"\nRadius of fan: " +this.getradius());
		}
		else
		{
			return("Fan's Color: " +this.getcolor() +"\nRadius of Fan: " +this.getradius() + "\nFan is " +fan_status);
		}
	}
	
	public int getspeed()
	{
		return speed;
	}
	
	public void setspeed(int speed)
	{
		this.speed = speed;
	}
	
	public double getradius()
	{
		return radius;
	}
	
	public void setradius(double radius)
	{
		this.radius = radius;
	}
	
	public String getcolor()
	{
		return color;
	}
	
	public void setcolor(String color)
	{
		this.color = color;
	}
	
	public boolean fan_on()
	{
		return fan_on;
	}
	
	public void setfan_on(boolean fan_on)
	{
		this.fan_on = fan_on;
	}
}

class fandemo
{
	public static void main(String args[])
	{
		fan fan1 = new fan(); 
		fan1.setspeed(fan.Fast);
		fan1.setradius(10);
		fan1.setcolor("Yellow");
		fan1.setfan_on(true);
		
		System.out.println(fan1.toString());
		
		fan fan2 = new fan();
		fan2.setspeed(fan.Medium);
		fan2.setradius(5);
		fan2.setcolor ("Blue");
		fan2.setfan_on(false);
		
		System.out.println("\n" +fan2.toString());
	}
}