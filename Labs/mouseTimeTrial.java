// Import Scanner
import java.util.Scanner;

public class mouseTimeTrial 
{
    public static void main(String[] args)
    {
        // Create mouse variables
        // Create a Scanner object
        Scanner keyboard = new Scanner(System.in);

        // Display welcome message to user
        System.out.println("You have fifteen points to distribute among five mouse qualities: ");
        System.out.print("\tCuriosity\n");
        System.out.print("\tHunger\n");
        System.out.print("\tSense of smell\n");
        System.out.print("\tCaution\n");
        System.out.print("\tSpeed\n");
        System.out.println("Each quality must have at least one point");
    }
}
