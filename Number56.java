import java.util.Scanner;

public class Number56{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your first name and last name in a single line > ");
		String fullName = scan.nextLine();
		System.out.println("your full name is " + fullName);

		int space = fullName.indexOf(" ");

		String firstName = fullName.substring(0, space);
		String lastName = fullName.substring(space + 1);

		System.out.println("\nYour first name is " + firstName + 
							"\nYour last name is " + lastName );
	}
}