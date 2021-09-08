import java.util.*;
class vol_area
{
	private double w; //width
	private double h; //height
	private double d; //depth
	
	public void getvalue()
	{
		//accept values of width, height & depth of a box
		System.out.print("Enter width: ");
		Scanner sc = new Scanner(System.in);
		w = sc.nextDouble();
		System.out.print("Enter height: ");
		h = sc.nextDouble();
		System.out.print("Enter depth: ");
		d = sc.nextDouble();
	}
	
	public double vol_calc()
	{
		double vol; //volume
		vol = w*h*d;
		return (vol);
	}
	
	public double area_calc()
	{
		double surface_area;
		surface_area = 2*((w*h)+(h*d)+(d*w));
		return (surface_area);
	}
}

class vol_area_demo
{
	public static void main(String args[])
	{
		vol_area vsa = new vol_area();
		Scanner sc = new Scanner(System.in);
		
		//menu
		System.out.println("\t\t*****Menu*****");
		System.out.println("1. Volume of a Box with unique dimensions");
		System.out.println("2. Surface Area of Box with unique dimensions");
		System.out.println("3. Both Volume & Surface Area of a Box with same dimensions");		
		System.out.println("0. Quit");
		
		boolean quit = false;
		int choice;
            do {
                  System.out.print("\nChoose menu item: ");
                  choice = sc.nextInt();
                  switch (choice) {
                  case 1:
                        vsa.getvalue();
						double vol_result = vsa.vol_calc();
						System.out.println("\nVolume of box: " +vol_result);
						System.out.println("---------------------------");
                        break;

                  case 2:
						vsa.getvalue();
						double area_result = vsa.area_calc();
						System.out.println("Surface Area of box: " +area_result);
						System.out.println("---------------------------");
                        break;

                  case 3:
                        vsa.getvalue();
						vol_result = vsa.vol_calc();
						System.out.println("\nVolume of box: " +vol_result);
						area_result = vsa.area_calc();
						System.out.println("Surface Area of box: " +area_result);
						System.out.println("---------------------------");
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