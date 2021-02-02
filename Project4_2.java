import java.util.Scanner;

public class Project4_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter a side: ");
		double a = sc.nextDouble();	
		System.out.print("Enter a second side: ");
		double b = sc.nextDouble();	
		System.out.print("Enter a third side: ");
		double c = sc.nextDouble();	
		
		if ((a * a) + (b * b) == (c * c) || (c * c) + (b * b) == (a * a) ||(c * c) + (a * a) == (b * b))
		{
		
			System.out.println("The triangle is a right triangle");		
		}
		else
		{
			System.out.println("The triangle is not right triangle");
		}
	}
}