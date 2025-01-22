import java.util.Scanner;

import static java.lang.System.*;

public class CircleArea
{
    public static void main(String[] args)
    {

        out.println("\n Welcome to my Circle Area program !! \n");

        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.println("\n Please enter the radius: ");
        double radius = scanner.nextDouble();

        // Calculate area of circle with given radius
        double area = Math.PI * radius * radius;

        out.println("\n\n The area of a circle with radius " + radius + " is " + area);

    }
}