import java.util.Random;

public class Number59{
	public static void main(String[] args){

		Random random = new Random();

		int number1 = random.nextInt(100 - 60) + 60;
		int number2 = random.nextInt(100 - 60) + 60;
		int number3 = random.nextInt(100 - 60) + 60;
		int number4 = random.nextInt(100 - 60) + 60;
		int number5 = random.nextInt(100 - 60) + 60;

		System.out.println("The five numbers are " + number1 + ", " + number2 +
			            ", " + number3 + ", " + number4 + " and " + number5);

		int min1 = Math.min(number1, number2);
		int min2 = Math.min(number3, number4);

		int small = Math.min(min1, min2);
		
		int smallest = Math.min(small, number5);

		System.out.println("\nThe smallest number out of the five is " + smallest);
	}
}
