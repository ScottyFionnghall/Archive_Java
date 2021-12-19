import java.util.Scanner;
public class InputVarConsoleDemo{
  public static void main(String[] args){
    //создаём input
    Scanner input = new Scanner(System.in);
    //текущий год
    int now = 2019;
    //var для имени пользователя
    String name;
    //var для возраста
    int age;
    //var для роста в метрах(действительное число)
    double height;
    //масса в кг
    double mass;
    System.out.println("You're name");
    //считываем
    name=input.nextLine();
    System.out.println("You're age");
    //считываем(2)
    age=input.nextInt();
    System.out.println("You're height");
    //рост, действительное число
    height = input.nextDouble();
    //вес
    System.out.println("You're weight");
    mass=input.nextDouble();
    double bmi=mass/height/height;
    System.out.println("Hey, "+ name);
    System.out.println("You were born in "+(now-age));
    System.out.printf("You're bmi is %5.2f\n",bmi);

  }
}
