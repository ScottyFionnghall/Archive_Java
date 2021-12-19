import java.util.Scanner;

public class ConsoleInputDemo{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String day,month;
		System.out.println("Какой сегодня день?");
		day = input.nextLine();
		System.out.println("Какой сегодня месяц?");
		month = input.nextLine();
		System.out.println("Сегодня "+day+". Месяц: "+month+".");
	}
}