import java.util.Scanner;

public class BirthWeightData {
	public static void main(String[] args) {
		// Initialize variables
		double input;

		double extremelyLowBirthWeightTotal = 0;
		int extremelyLowBirthWeightInputTotal = 0;
		double extremelyLowBirthWeightAverage = 0;
		double extremelyLowBirthWeightPercentage = 0;

		double veryLowBirthWeightTotal = 0;
		int veryLowBirthWeightInputTotal = 0;
		double veryLowBirthWeightAverage = 0;
		double veryLowBirthWeightPercentage = 0;

		double lowBirthWeightTotal = 0;
		int lowBirthWeightInputTotal = 0;
		double lowBirthWeightAverage = 0;
		double lowBirthWeightPercentage = 0;

		double normalBirthWeightTotal = 0;
		int normalBirthWeightInputTotal = 0;
		double normalBirthWeightAverage = 0;
		double normalBirthWeightPercentage = 0;

		double totalWeights = 0;
		double totalWeightInputs = 0;
		
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Display message to user to enter input
		System.out.print("Please enter the next birth weight, -1 when done: ");
		input = keyboard.nextDouble();

		// Accumulate the weight data from user until -1 is entered.
		while (input != -1) {
			if (input <= 0) {
				System.out.println("That is an invalid weight.");
			}
			else {
				if (input >= 1 && input <= 999) {
					extremelyLowBirthWeightTotal += input;
					extremelyLowBirthWeightInputTotal++;
				}
				else if (input >= 1000 && input <= 1499) {
					veryLowBirthWeightTotal += input;
					veryLowBirthWeightInputTotal++;
				}
				else if (input >= 1500 && input <= 2499) {
					lowBirthWeightTotal += input;
					lowBirthWeightInputTotal++;
				}
				else if (input >= 2500) {
					normalBirthWeightTotal += input;
					normalBirthWeightInputTotal++;
				}
			}

			totalWeights = extremelyLowBirthWeightTotal + veryLowBirthWeightTotal + lowBirthWeightInputTotal + normalBirthWeightTotal;
			totalWeightInputs = extremelyLowBirthWeightInputTotal + veryLowBirthWeightInputTotal + lowBirthWeightInputTotal + normalBirthWeightInputTotal; 

			if (extremelyLowBirthWeightTotal == 0) {
				extremelyLowBirthWeightAverage = 0;
			}
			else {
				extremelyLowBirthWeightAverage = extremelyLowBirthWeightTotal / extremelyLowBirthWeightInputTotal;
			}

			if (veryLowBirthWeightTotal == 0) {
				veryLowBirthWeightAverage = 0;
			}
			else {
				veryLowBirthWeightAverage = veryLowBirthWeightTotal / veryLowBirthWeightInputTotal; 
			}

			if (lowBirthWeightTotal == 0) {
				lowBirthWeightAverage = 0; 
			}
			else {
				lowBirthWeightAverage = lowBirthWeightTotal / lowBirthWeightInputTotal;
			}

			if (normalBirthWeightTotal == 0) {
				normalBirthWeightAverage = 0; 
			}
			else {
				normalBirthWeightAverage = normalBirthWeightTotal / normalBirthWeightInputTotal; 
			}

			extremelyLowBirthWeightPercentage = (extremelyLowBirthWeightInputTotal / totalWeightInputs) * 100;
			veryLowBirthWeightPercentage = (veryLowBirthWeightInputTotal / totalWeightInputs) * 100;
			lowBirthWeightPercentage = (lowBirthWeightInputTotal / totalWeightInputs) * 100;
			normalBirthWeightPercentage = (normalBirthWeightInputTotal / totalWeightInputs) * 100;
			
			// Get the next weight data
			System.out.print("Please enter the next birth weight, -1 when done: ");
			input = keyboard.nextDouble();
		}
		
		// Display output messages.
		if (totalWeights != 0) {
			System.out.println("Category\t\tAverage\t\t    Number\t\t% of Total");
			System.out.printf("Extremely LBW\t\t%-20.2f%-20d%-20.2f\n", extremelyLowBirthWeightAverage, extremelyLowBirthWeightInputTotal, extremelyLowBirthWeightPercentage);
			System.out.printf("Very LBW\t\t%-20.2f%-20d%-20.2f\n", veryLowBirthWeightAverage, veryLowBirthWeightInputTotal, veryLowBirthWeightPercentage);
			System.out.printf("Low Birth Weight\t%-20.2f%-20d%-20.2f\n", lowBirthWeightAverage, lowBirthWeightInputTotal, lowBirthWeightPercentage);
			System.out.printf("Normal Weight\t\t%-20.2f%-20d%-20.2f\n", normalBirthWeightAverage, normalBirthWeightInputTotal, normalBirthWeightPercentage);
		}		
		else {
			System.out.println("No weights were entered.");
		}
	}
}
