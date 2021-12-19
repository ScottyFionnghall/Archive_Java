/*
Use the Pythagorean theorem to
find the length of the hypotenuse
given the lengths of the two opposing
sides.
*/

import java.util.Scanner;

public class Hypot{
	public static void main(String[] args) {
		double x,y,z;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Define x:");
		x = userInput.nextDouble();
		System.out.println("Define y:");
		y = userInput.nextDouble();
		z = Math.sqrt(x*x+y*y);
		System.out.println("Hypotenuse is "+z);
	}
}

