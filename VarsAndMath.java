import static java.lang.System.*;

public class VarsAndMath
{
    public static void main(String[] args)
    {

        out.println("\n Welcome to variables and math !! \n");

        int a = 10;
        double b = 5.5;
        double sum = a + b;

        out.println("\n\n The sum of " + a + " and " + b + " is " + sum);

        double product = a * b;

        out.println("\n\n The product of " + a + " and " + b + " is " + product);

        a = 20;
        sum = a + b;
        out.println("\n\n The new sum of " + a + " and " + b + " is " + sum + "\n\n");
    }
}