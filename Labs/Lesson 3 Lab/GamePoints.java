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

        // Get input from user.
        System.out.print("Which player (1, 2, 3, 4, 5; -1 to quit): ");
        input = keyboard.nextInt();

        while (input != -1)
        {
            switch (input)
            {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
            }
            System.out.print("Which player (1, 2, 3, 4, 5; -1 to quit): ");
            input = keyboard.nextInt();
        }
    }
}