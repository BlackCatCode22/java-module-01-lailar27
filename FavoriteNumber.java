// favoriteNumber.java
// lR 1/21/25
// refactor to rename the default "Main" to something relevant
// Scanner class is here:
// https://www.w3schools.com/java/java_user_input.asp

import java.util.Scanner;

public class FavoriteNumber
{
    public static void main(String[] args)
    {
        System.out.println("\n\n******* Welcome to my Favorite Number Program! *******\n\n");

        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create a String variable to hold our user's favorite number.
        String favoriteNumber;

        // Prompt the user for their favorite number
        System.out.println("\n Please enter your favorite number: ");

        // get the input into our variable
        favoriteNumber  = String.valueOf(Integer.parseInt(scanner.nextLine()));

        // Prove that you got the number.
        System.out.println("\n Looks like your favorite number is " + favoriteNumber + ". Good choice!");
    }
}

