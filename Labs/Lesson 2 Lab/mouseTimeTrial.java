
// Import Scanner
import java.util.Scanner;

public class mouseTimeTrial {
    public static void main(String[] args) {
        // Create mouse variables
        double mouseCuriosity, mouseHunger, mouseSenseOfSmell, mouseCaution, mouseSpeed;
        String mouseName;
        char mouseType;

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

        // Get mouse information from user
        System.out.print("How many points for curiosity?: ");
        mouseCuriosity = keyboard.nextDouble();
        System.out.print("How many points for hunger?: ");
        mouseHunger = keyboard.nextDouble();
        System.out.print("How many points for sense of smell?: ");
        mouseSenseOfSmell = keyboard.nextDouble();
        System.out.print("How many points for caution?: ");
        mouseCaution = keyboard.nextDouble();
        System.out.print("How many points for speed?: ");
        mouseSpeed = keyboard.nextDouble();
        System.out.print("Enter a name for your mouse: ");
        mouseName = keyboard.next();
        System.out.print("Enter A, B, or C for mouse type: ");
        mouseType = keyboard.next().charAt(0);

    }
}
