import java.util.Scanner;

public class Number65{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your full email address > ");
		String email = scan.next();

		int atSign = email.indexOf("@");

		String username = email.substring(0, atSign);
		String domainName = email.substring(atSign + 1);

		System.out.println("\nThe username is " + username);
		System.out.println("The domain name is " + domainName);
	}
}