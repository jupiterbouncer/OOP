import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Amount to apply interest on in GHS: ");
        double principal = input.nextDouble();

        System.out.println("Enter rate per annum: ");
        double rate = input.nextDouble();

        System.out.println("Number of years to apply the interest: ");
        double time = input.nextDouble();

        double simpleInterest = (principal * rate * time )/ 100;

        System.out.println("The interest on GHS " + principal + " at " + rate + "% per annum" + 
        "for " + time + " years is GHS " + simpleInterest);
    }
}