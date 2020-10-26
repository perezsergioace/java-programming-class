
// Import Scanner
import java.util.Scanner;

public class mouseTimeTrial {
    public static void main(String[] args) {
        // Create mouse variables
        int mouseCuriosity, mouseHunger, mouseSenseOfSmell, mouseCaution, mouseSpeed, mouseQualityPoints;
        double mouseTypeATime, mouseTypeBTime, mouseTypeCTime;
        String mouseName;
        char mouseType;
        boolean maxPointsBoolean, minimumMouseQualityBoolean, mouseTypeBoolean;

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
        mouseCuriosity = keyboard.nextInt();
        System.out.print("How many points for hunger?: ");
        mouseHunger = keyboard.nextInt();
        System.out.print("How many points for sense of smell?: ");
        mouseSenseOfSmell = keyboard.nextInt();
        System.out.print("How many points for caution?: ");
        mouseCaution = keyboard.nextInt();
        System.out.print("How many points for speed?: ");
        mouseSpeed = keyboard.nextInt();
        System.out.print("Enter a name for your mouse: ");
        mouseName = keyboard.next();
        System.out.print("Enter A, B, or C for mouse type: ");
        mouseType = keyboard.next().charAt(0);

        mouseQualityPoints = mouseCuriosity + mouseHunger + mouseSenseOfSmell + mouseCaution + mouseSpeed;

        // Check input validation
        if (mouseQualityPoints > 15) {
            System.out.printf("You've used %d points - only 15 are allowed.\n", mouseQualityPoints);
            maxPointsBoolean = false;
        } else {
            maxPointsBoolean = true;
        }

        if (mouseCuriosity < 1 || mouseHunger < 1 || mouseSenseOfSmell < 1 || mouseCaution < 1 || mouseSpeed > 1) {
            System.out.print("Each mouse quality must be assigned a minimum value of 1.\n");
            minimumMouseQualityBoolean = false;
        } else {
            minimumMouseQualityBoolean = true;
        }

        switch (mouseType) {
            case 'a':
            case 'A':
                mouseTypeBoolean = true;
                break;
            case 'b':
            case 'B':
                mouseTypeBoolean = true;
                break;
            case 'c':
            case 'C':
                mouseTypeBoolean = true;
                break;
            default:
                System.out.printf("%s is not a valid mouse type. Mouse type must be A, B, or C.", mouseType);
                mouseTypeBoolean = false;
        }

        if (maxPointsBoolean == true && minimumMouseQualityBoolean == true && mouseTypeBoolean == true) {
            System.out.println("These all passed to do the calculations!");
        }

        mouseTypeATime = Math.log(mouseCuriosity) + Math.log(mouseSpeed) / Math.log(2) + Math.log(mouseSenseOfSmell);
        mouseTypeBTime = Math.log(mouseCaution) + Math.log(mouseHunger) / Math.log(2) + Math.log(mouseSenseOfSmell);
        mouseTypeCTime = Math.log(mouseHunger) + Math.log(mouseSpeed) / Math.log(2) + Math.log(mouseCaution);

        // System.out.printf("%s's time through the maze is %.2f seconds.", mouseName,
        // mouseTypeBTime);
    }
}
