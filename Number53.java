import java.util.Random;

public class Number53{
	public static void main(String[] args){

		Random random = new Random();

		int number1 = random.nextInt(101);
		int number2 = random.nextInt(101);

		System.out.println("The random numbers are " + number1 +
				    " and " + number2);

		System.out.println("\nThe smallest number is: " + Math.min(number1, number2));

	}
}
