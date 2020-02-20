import java.util.Random;

public class Number60{
	public static void main(String[] args){

		Random random = new Random();

		int number1 = random.nextInt(51);
		int number2 = random.nextInt(51);
		int number3 = random.nextInt(51);

		System.out.println("The three random numbers are " + number1 + ", " + number2 +
							" and " + number3);

		System.out.println("\nThe average of thes three numbers is " +
							((number1 + number2 + number3)/3.0));
	}
}