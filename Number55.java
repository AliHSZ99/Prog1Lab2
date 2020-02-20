import java.util.Scanner;

public class Number55{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a file name > ");
		String fileName = scan.next();

		int dot = fileName.indexOf(".");

		System.out.println(fileName.substring(dot + 1));
	}
}