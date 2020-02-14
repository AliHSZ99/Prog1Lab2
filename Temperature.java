import java.util.Scanner;

public class Temperature{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the temperature in °C in the past three days > ");
		int temp1 = scan.nextInt();
		int temp2 = scan.nextInt();
		int temp3 = scan.nextInt();

		System.out.println("The average temperature in the last three days is " +
								((temp1 + temp2 + temp3)/3));
	}
} 