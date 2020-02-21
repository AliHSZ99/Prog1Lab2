import java.util.Scanner;
import java.text.DecimalFormat;

public class Number61{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		DecimalFormat percentPattern = new DecimalFormat("0.0#%");

		System.out.print("Enter the number of shots taken > ");
		double shots = scan.nextDouble();
		System.out.println("You have taken " + shots + " shots.");

		System.out.print("\nEnter the number of shots made > ");
		int shotsMade = scan.nextInt();
		System.out.println("You have made " + shotsMade + " shots.");

		double shotPercentage = shotsMade / shots;

		System.out.println("\nThe shooting percentage is " + 
							percentPattern.format(shotPercentage));
	}
}