
// Import Scanner
import java.util.Scanner;

public class mouseTimeTrial {
    public static void main(String[] args) {
        // Create mouse variables
        double mouseCuriosity, mouseHunger, mouseSenseOfSmell, mouseCaution, mouseSpeed;
        double mouseTypeATime, mouseTypeBTime, mouseTypeCTime;
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

        // Calculate the mouse's time depending on mouse type(A, B, or C)
        mouseTypeATime = Math.log(mouseCuriosity) + Math.log(mouseSpeed) / Math.log(2) + Math.log(mouseSenseOfSmell);
        mouseTypeBTime = Math.log(mouseCaution) + Math.log(mouseHunger) / Math.log(2) + Math.log(mouseSenseOfSmell);
        mouseTypeCTime = Math.log(mouseHunger) + Math.log(mouseSpeed) / Math.log(2) + Math.log(mouseCaution);

        // System.out.printf("time through the maze is %.2f seconds.", mouseTypeBTime);
    }
}
