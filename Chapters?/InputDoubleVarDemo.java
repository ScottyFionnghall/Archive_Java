import javax.swing.JOptionPane;
public class InputDoubleVarDemo{
 public static void main(String[] args) {
   //var. действительные числа
   double mass,height,bmi;
   // var. текст
   String result;
   //ввод
   result=JOptionPane.showInputDialog("You're height");
   //перевод из текста в действительное число
   height=Double.parseDouble(result);
   //ввод2
   result=JOptionPane.showInputDialog("You're mass");
   //перевод из текста в действительное число
   mass=Double.parseDouble(result);
   //вычесления
   bmi=mass/height/height;
   //округление
   bmi=Math.round(bmi*100)/100.0;
   //вывод
   JOptionPane.showMessageDialog(null,"Index of body mass "+bmi);
 }
}
