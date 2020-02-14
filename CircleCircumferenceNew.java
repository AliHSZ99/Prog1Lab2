import java.util.Scanner;

public class CircleCircumferenceNew{
	public static void main(String [] args){

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the value of the circle's radius > ");
		double radius = scan.nextDouble();

		System.out.println("The circumference of the circle is " + (2*Math.PI*radius));

	
	}
}
