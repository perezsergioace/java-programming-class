import java.util.Scanner;

public class GamePoints {
    public static void main(String[] args) {
        // Create variables for each player and the team.
        int playerOnePointsInput;
        int playerOnePointsTotal = 0;
        double playerOnePercentage;

        int playerTwoPointsInput;
        int playerTwoPointsTotal = 0;
        double playerTwoPercentage;

        int playerThreePointsInput;
        int playerThreePointsTotal = 0;
        double playerThreePercentage;

        int playerFourPointsInput;
        int playerFourPointsTotal = 0;
        double playerFourPercentage;

        int playerFivePointsInput;
        int playerFivePointsTotal = 0;
        double playerFivePercentage;

        int largest = 0;
        int teamTotalPoints = 0;
        String starPlayer = "";
        int input;

        // Create Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get input from user.
        System.out.print("Which player (1, 2, 3, 4, 5; -1 to quit): ");
        input = keyboard.nextInt();

        if (input == -1) {
            // Print message to let the user know there were no scores entered
            System.out.println("No scores were entered.");
        } else {
            while (input != -1) {
                // Add the points for each player from the user's input
                switch (input) {
                    case 1:
                        System.out.print("How many points did player 1 score? ");
                        playerOnePointsInput = keyboard.nextInt();
                        if (playerOnePointsInput < 0) {
                            System.out.println("That is an invalid score.");
                        } else {
                            playerOnePointsTotal += playerOnePointsInput;
                        }
                        break;
                    case 2:
                        System.out.print("How many points did player 2 score? ");
                        playerTwoPointsInput = keyboard.nextInt();
                        if (playerTwoPointsInput < 0) {
                            System.out.println("That is an invalid score.");
                        } else {
                            playerTwoPointsTotal += playerTwoPointsInput;
                        }
                        break;
                    case 3:
                        System.out.print("How many points did player 3 score? ");
                        playerThreePointsInput = keyboard.nextInt();
                        if (playerThreePointsInput < 0) {
                            System.out.println("That is an invalid score.");
                        } else {
                            playerThreePointsTotal += playerThreePointsInput;
                        }
                        break;
                    case 4:
                        System.out.print("How many points did player 4 score? ");
                        playerFourPointsInput = keyboard.nextInt();
                        if (playerFourPointsInput < 0) {
                            System.out.println("That is an invalid score.");
                        } else {
                            playerFourPointsTotal += playerFourPointsInput;
                        }
                        break;
                    case 5:
                        System.out.print("How many points did player 5 score? ");
                        playerFivePointsInput = keyboard.nextInt();
                        if (playerFivePointsInput < 0) {
                            System.out.println("That is an invalid score.");
                        } else {
                            playerFivePointsTotal += playerFivePointsInput;
                        }
                        break;
                    // Print error message if the user enters a invalid player number
                    default:
                        System.out.println("That is not a valid player number.");
                }

                System.out.print("Which player (1, 2, 3, 4, 5; -1 to quit): ");
                input = keyboard.nextInt();

                // Calculate the overall points of the team
                teamTotalPoints = playerOnePointsTotal + playerTwoPointsTotal + playerThreePointsTotal
                        + playerFourPointsTotal + playerFivePointsTotal;

                // Decided which player has the most points and select them as the star player
                if (largest < playerOnePointsTotal) {
                    largest = playerOnePointsTotal;
                    starPlayer = "Player 1";
                } else if (largest < playerTwoPointsTotal) {
                    largest = playerTwoPointsTotal;
                    starPlayer = "Player 2";
                } else if (largest < playerThreePointsTotal) {
                    largest = playerThreePointsTotal;
                    starPlayer = "Player 3";
                } else if (largest < playerFourPointsTotal) {
                    largest = playerFourPointsTotal;
                    starPlayer = "Player 4";
                } else if (largest < playerFivePointsTotal) {
                    largest = playerFivePointsTotal;
                    starPlayer = "Player 5";
                }

                // Convert each individual players point from an integer to a double
                double playerOnePointsTotalDouble = playerOnePointsTotal;
                double playerTwoPointsTotalDouble = playerTwoPointsTotal;
                double playerThreePointsTotalDouble = playerThreePointsTotal;
                double playerFourPointsTotalDouble = playerFourPointsTotal;
                double playerFivePointsTotalDouble = playerFivePointsTotal;
                // Convert the team's total points from an integer to a double
                double teamTotalPointsDouble = teamTotalPoints;

                // Calculate the percentage of the points for each player
                playerOnePercentage = (playerOnePointsTotalDouble / teamTotalPointsDouble) * 100;
                playerTwoPercentage = (playerTwoPointsTotalDouble / teamTotalPointsDouble) * 100;
                playerThreePercentage = (playerThreePointsTotalDouble / teamTotalPointsDouble) * 100;
                playerFourPercentage = (playerFourPointsTotalDouble / teamTotalPointsDouble) * 100;
                playerFivePercentage = (playerFivePointsTotalDouble / teamTotalPointsDouble) * 100;

                if (input == -1) {
                    if (teamTotalPoints > 0) {
                        // Display results to the user
                        System.out.println("Team Total - " + teamTotalPoints);
                        System.out.println("High Score - " + largest);
                        System.out.println("Star Player - " + starPlayer);

                        System.out.println("Player 1 points - " + playerOnePointsTotal);
                        System.out.printf("%.2f%%\n", playerOnePercentage);

                        System.out.println("Player 2 points - " + playerTwoPointsTotal);
                        System.out.printf("%.2f%%\n", playerTwoPercentage);

                        System.out.println("Player 3 points - " + playerThreePointsTotal);
                        System.out.printf("%.2f%%\n", playerThreePercentage);

                        System.out.println("Player 4 points - " + playerFourPointsTotal);
                        System.out.printf("%.2f%%\n", playerFourPercentage);

                        System.out.println("Player 5 points - " + playerFivePointsTotal);
                        System.out.printf("%.2f%%\n", playerFivePercentage);
                    } else {
                        // Print a error message when a user does not enter any scored for the players
                        System.out.println("No scores were entered.");
                    }
                }
            }
        }
    }
}