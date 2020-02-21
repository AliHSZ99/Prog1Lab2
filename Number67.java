import java.util.Scanner;

public class Number67{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		// The character are odd numbered for the user but isn't for the programmer and computer
		System.out.print("Enter a secret message(five characters) by writing each letter in odd numbered indexes > ");
		String message = scan.next();

		String letter1 = message.substring(0, 1);
		String letter2 = message.substring(2, 3);
		String letter3 = message.substring(4, 5);
		String letter4 = message.substring(6, 7);
		String letter5 = message.substring(8, 9);

		String secret = letter1 + letter2 + letter3 + letter4 + letter5;

		System.out.println("\nYour secret word is: " + secret);


	}
}