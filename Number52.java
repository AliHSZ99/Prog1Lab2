import java.util.Scanner;

public class Number52{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("\nEnter any word > ");
		String word = scan.next();

		String wordUpper = word.toUpperCase();
		String wordLower = word.toLowerCase();

		System.out.println("\n\nThe word is " + word + "." +
							"\nThe word in upper case letters becomes " + wordUpper + "." +
							"\nThe word in lower case letters becomes " + wordLower + ".");

	}
}