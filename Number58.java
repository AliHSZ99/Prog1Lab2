import java.util.Scanner;

public class Number58{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the radius of the circle of which you want to" +
							"\nfind its area and its circumference > ");
		double radius = scan.nextDouble();
		System.out.println("The radius of the circle is " + radius);

		double area = Math.PI * Math.pow(radius, 2);
		double circumference = 2 * Math.PI * radius;

		System.out.println("\nThe circumference of the circle is " + circumference +
							"\nThe area of the circle is " + area);
	
	}
}