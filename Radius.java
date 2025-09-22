import java.util.Scanner;

public class Radius{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        double math_pi = 3.14159;

        System.out.println("Enter the radius in centimeters: ");
        double radius = input.nextDouble();

        double area = math_pi * radius * radius;

        System.out.println("A circle with a radius of " + radius + " centimeters is "+
        area + " centimeters squared");
    }
}