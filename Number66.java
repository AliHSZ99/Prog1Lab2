import java.util.Scanner;

public class Number66{
	public static void main(String[]args){

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a 10 digit phone number (no space, no () and no -) > ");
		String number = scan.next();
		System.out.println("The phone number entered is " + number);

		String firstSet = number.substring(0, 3);
		String secondSet = number.substring(3, 6s);
		String lastSet = number.substring(6);

		System.out.println("Below lies your formatted number:");

		System.out.println("\t(" + firstSet + ") " + secondSet + "-" + lastSet);
	}
}