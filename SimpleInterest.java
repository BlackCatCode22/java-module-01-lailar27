import java.util.Scanner;

import static java.lang.System.*;

public class SimpleInterest
{
    public static void main(String[] args)
    {

        out.println("\n Welcome to my Simple Interest program !! \n");

        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter values for principal, rate, and time
        System.out.println("\n Please enter a value for the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.println("\n Please enter a value for the interest rate (in percentage): ");
        double rate = scanner.nextDouble();

        System.out.println("\n Please enter a value for the time period (in years): \n");
        double time = scanner.nextDouble();

        // Calculate simple interest value
        double simpleInterest = (principal * rate * time) / 100;

        // Prove the simple interest is valid
        out.println("The simple interest is: " + simpleInterest);

    }}