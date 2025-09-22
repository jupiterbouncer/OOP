import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		System.out.println("Enter first number: ");
		double number1 = input.nextDouble();

		System.out.println("Enter second number: ");
		double number2 = input.nextDouble();

		System.out.println("Enter third number: ");
		double number3 = input.nextDouble();

		System.out.println("Enter fourth number: ");
		double number4 = input.nextDouble();

		double average = (number1 + number2 + number3 + number4)/4;

		System.out.println("The average of " + number1 + ", "+ number2 + ", " + number3 +
		", " + number4 + " is " + average);
	}
}
