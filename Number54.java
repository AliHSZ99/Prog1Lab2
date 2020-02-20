import java.util.Scanner;

public class Number54{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number that you want to the power of 3 > ");
		double number = scan.nextDouble();
		
		System.out.println(number + " to the power of 3 is " +
				   Math.pow(number, 3));
	}
}
