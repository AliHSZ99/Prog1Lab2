import java.util.Scanner;

public class MyAgeIsNew{
	public static void main (String []args){

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the current year > ");
		int currentYear = scan.nextInt();
		System.out.println("The current year is " + currentYear);

		System.out.print("Enter your year of birth > ");
		int yearOfBirth = scan.nextInt();
		
		System.out.println("Your age is or will be " + (currentYear - yearOfBirth) + " in the current year.");


	}
}