import java.util.Scanner;

public class Time{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number of seconds you want to convert to minutes > ");
		int seconds = scan.nextInt();
		System.out.println("Your time in seconds is " + seconds);

		int minutes = seconds/60;
		seconds = seconds%60;

		System.out.println("The time is " +
				   minutes + ":" +
				   seconds);

	}
}
