import java.util.Scanner;

import static java.lang.System.*;

public class SimpleCalculator
{
    public static void main(String[] args)
    {

        out.println("\n Welcome to my Simple Calculator program !! \n");

        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.println("\n Please enter any two integers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        // Perform basic arithmetic operations (addition, subtraction, division, multiplication)
        double sum = num1 + num2;
        double difference = num1 - num2;
        double quotient = num1 / num2;
        double product = num1 * num2;

        // Prove that the basic arithmetic operations are valid
        out.println(" Addition: " + num1 + " + " + num2 + " = " + sum);
        out.println(" Subtraction: " + num1 + " - " + num2 + " = " + difference);
        out.println(" Division: " + num1 + " / " + num2 + " = " + quotient);
        out.println(" Multiplication: " + num1 + " * " + num2 + " = " + product);

    }
}