import java.util.Scanner;

import static java.lang.System.*;

public class CharacterDetails
{
    public static void main(String[] args)
    {

        out.println("\n Welcome to my Character Details program !! \n");

        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.println("\n Please enter a character: ");
        char inputChar = scanner.next().charAt(0);

        // Display character's Unicode value
        int unicodeValue = (int) inputChar;
        out.println("The Unicode value of the character, " + inputChar + ", is: " +unicodeValue);
        

        // State whether the character is a letter or a digit
        if (Character.isLetter(inputChar)) {
            out.println(inputChar + " is a letter. ");
        } else if (Character.isDigit(inputChar)) {
            out.println(inputChar + " is a digit. ");
        }
}}