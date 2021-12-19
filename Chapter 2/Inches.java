/*
a program that computes the number of cubic inches contained in a cube that is
one mile by one mile, by one mile
*/
import java.util.Scanner;

public class Inches{
	public static void main(String[] args) {
		Scanner inputObj = new Scanner(System.in); //defined Scanner object
		long ci;
		long im;
		System.out.println("How many cubic miles you want to convert to cubic inches?");
		int userInput = inputObj.nextInt(); //got user input
		im = userInput * 5280 * 12; //convert miles to inches
		ci = im*im*im; //calculate cubic inches
		//ci = Math.pow(im,3); We can use Math.pow() for calculations but the results would be messy
		System.out.println("There are "+ci+" cubic inches in "+userInput+ " cubic mile(s).");
	}
}