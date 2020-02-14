import java.util.Scanner;

public class AverageNew{
	public static void main(String [] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter four numbers that are integers > ");
		int value1 = scan.nextInt();
		int value2 = scan.nextInt();
		int value3 = scan.nextInt();
		int value4 = scan.nextInt();

		System.out.println("The average of the integers given is " + (value1 + value2 + value3 +value4)/4.0 );


	}
}