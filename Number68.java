import java.util.Scanner;

public class Number68{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a website URL starting with www. and ending with .com > ");
		String website = scan.next();

		int dot1 = website.indexOf(".");
		String site = website.substring(dot1 + 1);

		int dot2 = site.indexOf(".");
		String site2 = site.substring(0, dot2);

		System.out.println("\nThe name of the website is: " + site2);
	}
}