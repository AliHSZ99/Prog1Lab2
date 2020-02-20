import java.util.Scanner;

public class Number51{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a domain name > ");
		String domainName = scan.next();

		System.out.println("\nwww." + domainName + ".com");
	}
}