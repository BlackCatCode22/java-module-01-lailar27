import java.util.Scanner;

import static java.lang.System.*;

public class MadLibs
{
    public static void main(String[] args)
    {

        out.println("\n Welcome to my MadLibs program !! \n");

        // Create a predefined story with placeholders for a boy name, a girl name, a place, a number, and an adjective
        String Story = "In an isolated island called [place], [boy name] and [girl name] got married. They had [number] kids and lived a [adjective] life.";;

        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a series of words
        System.out.println("\n Please enter a boy name: ");
        String boyName = scanner.nextLine();

        System.out.println("\n Please enter a girl name: ");
        String girlName = scanner.nextLine();

        System.out.println("\n Please enter a place: ");
        String place = scanner.nextLine();

        System.out.println("\n Please enter a number: ");
        String number = scanner.nextLine();

        System.out.println("\n Please enter an adjective: ");
        String adjective = scanner.nextLine();

        // Substitute inputted series of words into predefined story
        String substitutedStory = "In an isolated island called, " + place + ", " + boyName + " and " + girlName + " got married. They had " + number + " kids and lived a " + adjective + " life.";

        // Display short story using the inputted series of words
        out.println("\nFinal short story: \n");
        out.println(substitutedStory);


        }
    }