import java.util.Scanner;

public class GamePoints
{
    public static void main(String[] args)
    {
        // Create variables for each player and the team.
        int playerOnePointsInput;
        int playerOnePointsTotal = 0;
        int playerTwoPointsInput;
        int playerTwoPointsTotal = 0;
        int playerThreePointsInput;
        int playerThreePointsTotal = 0;
        int playerFourPointsInput;
        int playerFourPointsTotal = 0;
        int playerFivePointsInput;
        int playerFivePointsTotal = 0;
        // int teamTotalPoints;
        int input;

        // Create Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get input from user.
        System.out.print("Which player (1, 2, 3, 4, 5; -1 to quit): ");
        input = keyboard.nextInt();

        if (input == -1)
        {
            System.out.println("No scores were entered.");
        }
        else
        {
            while (input != -1)
            {
                switch (input)
                {
                    case 1:
                        System.out.println("one");

                        System.out.print("How many points did player 1 score? ");
                        playerOnePointsInput = keyboard.nextInt();
                        if (playerOnePointsInput < 0)
                        {
                            System.out.println("That is an invalid score.");
                        }
                        else
                        {
                            playerOnePointsTotal += playerOnePointsInput;
                        }
                        break;
                    case 2:
                        System.out.println("two");
                        System.out.print("How many points did player 2 score? ");
                        playerTwoPointsInput = keyboard.nextInt();
                        playerTwoPointsTotal += playerTwoPointsInput;
                        break;
                    case 3:
                        System.out.println("three");
                        System.out.print("How many points did player 3 score? ");
                        playerThreePointsInput = keyboard.nextInt();
                        playerThreePointsTotal += playerThreePointsInput;
                        break;
                    case 4:
                        System.out.println("four");
                        System.out.print("How many points did player 4 score? ");
                        playerFourPointsInput = keyboard.nextInt();
                        playerFourPointsTotal += playerFourPointsInput;
                        break;
                    case 5:
                        System.out.println("five");
                        System.out.print("How many points did player 5 score? ");
                        playerFivePointsInput = keyboard.nextInt();
                        playerFivePointsTotal += playerFivePointsInput;
                        break;
                    default:
                        System.out.println("That is not a valid player number.");
                }

                System.out.print("Which player (1, 2, 3, 4, 5; -1 to quit): ");
                input = keyboard.nextInt();

                if (input == -1)
                {
                    System.out.println("Player 1 points - " + playerOnePointsTotal);
                    System.out.println("Player 2 points - " + playerTwoPointsTotal);
                    System.out.println("Player 3 points - " + playerThreePointsTotal);
                    System.out.println("Player 4 points - " + playerFourPointsTotal);
                    System.out.println("Player 5 points - " + playerFivePointsTotal);
                }
            }
        }
    }
}