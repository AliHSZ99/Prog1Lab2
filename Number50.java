import java.util.Scanner;
import java.text.*;
import java.lang.*;


public class Number50{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter two words representing passwords > ");
		String password1 = scan.nextLine();
		String password2 = scan.nextLine();

		int conversion1 = Integer.valueOf(password1);
		int conversion2 = Integer.valueOf(password2);

		System.out.print(Math.min(conversion1, conversion2));
	}
}