import java.util.Scanner;

import static java.lang.System.*;

public class TempConverter
{
    public static void main(String[] args)
    {

        out.println("\n Welcome to my Temperature Converter program !! \n");

        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature in degrees Fahrenheit
        System.out.println("\n Please enter the temperature in degrees Fahrenheit: ");
        double Fahrenheit = scanner.nextDouble();

        // Convert temperature from degrees Fahrenheit to degrees Celsius
        double Celsius = (Fahrenheit - 32) * 5/9;

        out.println("\n\n The temperature " + Fahrenheit + " degrees Fahrenheit is " + Celsius + " degrees Celsius.");

    }
}