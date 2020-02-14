import java.lang.String;
import java.util.Scanner;

public class InvertedName{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your full name in the following format: lastname, firstname > ");
		String invertedName = scan.nextLine();
		System.out.println("Your full name inverted is " + invertedName);

		int comma = invertedName.indexOf(',');     
		System.out.println("\nThe index of ',' in \"" + invertedName + "\" is " + comma);  // Finds index of the comma

		String lastName = invertedName.substring(0, comma);   //find and prints last name
		System.out.println("Your last name is " + lastName);

		String firstName = invertedName.substring(comma + 2);  // finds and prints first name
		System.out.println("The first name is " + firstName);

		String firstNameStart = firstName.substring(0, 1);
		firstNameStart = firstNameStart.toUpperCase();
		String firstNameRemainder = firstName.substring(1);
		firstNameRemainder = firstNameRemainder.toLowerCase();
		firstName = firstNameStart + firstNameRemainder;

		String lastNameStart = lastName.substring(0, 1);
		lastNameStart = lastNameStart.toUpperCase();
		String lastNameRemainder = lastName.substring(1);
		lastNameRemainder = lastNameRemainder.toLowerCase();
		lastName = lastNameStart +lastNameRemainder;

		String fullName = firstName + " " + lastName;

		System.out.println("\nThe formatted full name is " + fullName);


	}
}