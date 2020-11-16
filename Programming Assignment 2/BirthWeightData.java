import java.util.Scanner;

public class BirthWeightData {
	public static void main(String[] args) {
		// Initialize variables
		double input;
		double extremelyLowBirthWeightTotal = 0;
		double veryLowBirthWeightTotal = 0;
		double lowBirthWeightTotal = 0;
		double normalBirthWeightTotal = 0;
		double totalWeights = 0;
		
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Display message to user to enter input
		System.out.print("Please enter the next birth weight, -1 when done: ");
		input = keyboard.nextDouble();

		while (input != -1) {
			if (input < 0) {
				System.out.println("That is an invalid weight.");
			}
			else {
				if (input >= 0 && input <= 999) {
					extremelyLowBirthWeightTotal += input;
				}
				else if (input >= 1000 && input <= 1499) {
					veryLowBirthWeightTotal += input;
				}
				else if (input >= 1500 && input <= 2499) {
					lowBirthWeightTotal += input;
				}
				else if (input >= 1500) {
					normalBirthWeightTotal += input;
				}
			}

			totalWeights = lowBirthWeightTotal;
			
			// Get the next weight data
			System.out.print("Please enter the next birth weight, -1 when done: ");
			input = keyboard.nextDouble();
		}
		
		if (totalWeights != 0) {
			System.out.println("The total of Extremely Low Birth Weight is: " + extremelyLowBirthWeightTotal);
			System.out.println("The total of Very Low Birth Weight is: " + veryLowBirthWeightTotal);
			System.out.println("The total of Low Birth Weight is: " + lowBirthWeightTotal);
			System.out.println("The total of Normal Birth Weight is: " + normalBirthWeightTotal);
		}		
		else {
			System.out.println("No Weights were entered.");
		}
	}
}
