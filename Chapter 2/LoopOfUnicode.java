/*
simple loop to print out a lot of characters from Unicode
*/
import java.util.Scanner;
public class LoopOfUnicode{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		char character;
		int startRange,endRange;
		System.out.println("Define range of characters(start and end numbers)");
		startRange = userInput.nextInt();
		endRange = userInput.nextInt();
		for (int i = startRange;i <= endRange;i++){
			character = (char)i;
			System.out.println(character);
		}
	}
}