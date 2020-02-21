import java.util.Scanner;

public class AssignmentPractice{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a URL > ");
		String uRL = scan.next();

		boolean https = uRL.startsWith("https://");

		System.out.println("Your URL is safe and secure? " + https);
	}
}