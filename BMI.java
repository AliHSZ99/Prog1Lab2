import java.util.Scanner;

public class BMI{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your weight in pounds > ");
		double weight = scan.nextDouble();
		System.out.println("Your weight in kilograms is " + (weight*0.454)); // pound to kg ratio

		System.out.print("Enter your height in feet > ");
		double height = scan.nextDouble();
		System.out.println("Your height in meters is " + (height*0.3048)); //feet to meter

		System.out.println("\nYour BMI is currently " + 
								(weight*0.454/((Math.pow(height*0.3048, 2)))));


	}
}