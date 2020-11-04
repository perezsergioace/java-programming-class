import java.util.Scanner;

public class GamePoints
{
    public static void main(String[] args)
    {
        // Create variables for each player and the team.
        int playerOnePoints;
        int playerTwoPoints;
        int playerThreePoints;
        int playerFourPoints;
        int playerFivePoints;
        int teamTotalPoints;
        int input;

        // Create Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Display general instrucitons.
        System.out.print("Which player (1, 2, 3, 4, 5; -1 to quit): ");
        input = keyboard.nextInt();

        if (input == 1)
        {
            System.out.printf("How many points did player %d score? ", input);
            playerOnePoints = keyboard.nextInt();
            System.out.println(playerOnePoints);
        }
        else if (input == 2)
        {
            System.out.printf("How many points did player %d score? ", input);
            playerTwoPoints = keyboard.nextInt();
            System.out.println(playerTwoPoints);
        }
        else if (input == 3)
        {
            System.out.printf("How many points did player %d score? ", input);
            playerThreePoints = keyboard.nextInt();
            System.out.println(playerThreePoints);
        }
        else if (input == 4)
        {
            System.out.printf("How many points did player %d score? ", input);
            playerFourPoints = keyboard.nextInt();
            System.out.println(playerFourPoints);
        }
        else if (input == 5)
        {
            System.out.printf("How many points did player %d score? ", input);
            playerFivePoints = keyboard.nextInt();
            System.out.println(playerFivePoints);
        }
        
    }
}