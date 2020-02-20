import java.util.Scanner;
import java.text.DecimalFormat;

public class Number57{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		DecimalFormat moneyPattern = new DecimalFormat("$0.00");

		System.out.print("Enter the number of quarters > ");
		int quarters = scan.nextInt();

		System.out.print("Enter a number of dimes > ");
		int dimes = scan.nextInt();

		System.out.print("Enter a number of nickels > ");
		int nickels = scan.nextInt();

		double quarters1 = quarters * 0.25;
		double dimes1 = dimes * 0.10;
		double nickels1 = nickels * 0.05;

		System.out.println("The total amount of money is " + 
							moneyPattern.format(quarters1 + dimes1 + nickels1));

	}
}