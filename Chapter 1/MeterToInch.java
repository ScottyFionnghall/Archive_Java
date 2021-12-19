/*
Adapt Try This 1­2 so that it prints a conversion table of inches to meters. Display
12 feet of conversions, inch by inch. Output a blank line every 12 inches. (One meter
equals approximately 39.37 inches.)
*/
public class MeterToInch{
	public static void main(String[] args) {
		for (int i = 1; i <= 144;i++){
			if (i % 12 == 0){
				System.out.println("");
			}
			System.out.println(i+"inch is "+i/39.37+" meters");
		}
	}
}