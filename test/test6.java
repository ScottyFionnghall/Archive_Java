import java.util.Scanner;
public class test6{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		int task,task2,task3,task4,task5;
		num1 = input.nextInt();
		num2 = input.nextInt();
		task = num1 + num2;
		task2 = num1 - num2;
		task3 = num1 * num2;
		task4 = num1 / num2;
		task5 = num1 % num2;
		System.out.println(task);
		System.out.println(task2);
		System.out.println(task3);
		System.out.println(task4);
		System.out.println(task5);
	}
}