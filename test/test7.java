import java.util.Scanner;
public class test7{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		for (int i = 0; i<10; i++){
			System.out.println(num1 * (i+1));
		}
	}
}