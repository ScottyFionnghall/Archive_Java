/*
	Java programm to get Unicode character
	from inputed number
*/
import java.util.Scanner;

public class IntToChar{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int intch = userInput.nextInt();
		char ch = (char)intch;
		System.out.println(ch);
	}
}