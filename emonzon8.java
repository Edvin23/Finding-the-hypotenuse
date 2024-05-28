//Edvin Monzon
//CSC-321
//Lab #8

import java.util.Scanner;

public class emonzon8
{

	public static void main(String[] args)
	{
	
		Scanner input = new Scanner(System.in);
		double base = 0;
		double height = 0;
		double hypo;

	
		System.out.println("Please enter the base of the right triangle: ");
	
		base = input.nextDouble();
	
		System.out.println("Please enter the height of the right triangle: ");

		height = input.nextDouble();
			
		hypo = rightTriangle(base,height);

		System.out.println("The hypotenuse of the right triangle is: " + hypo);
	}

	static double  rightTriangle(double base, double height)
	{
	
		double hypotenuse = Math.sqrt((base*base) + (height*height));
		return hypotenuse;
	}
}
