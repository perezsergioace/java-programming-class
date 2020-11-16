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

		// Accumulate the weight data from the user until -1 is entered.
		while (input != -1) {
			// Check to see if the user enters 0 as an input, if so display an error message.
			if (input <= 0) {
				System.out.println("That is an invalid weight.");
			}
			else {
				// if the input is in the range of extremely low birth weight, add it to the accumulator. Also add to the Input total accumulator.
				if (input >= 1 && input <= 999) {
					extremelyLowBirthWeightTotal += input;
					extremelyLowBirthWeightInputTotal++;
				}
				// if the input is in the range of very low birth weight, add it to the accumulator. Also add to the Input total accumulator.
				else if (input >= 1000 && input <= 1499) {
					veryLowBirthWeightTotal += input;
					veryLowBirthWeightInputTotal++;
				}
				// if the input is in the range of low birth weight, add it to the accumulator. Also add to the Input total accumulator.
				else if (input >= 1500 && input <= 2499) {
					lowBirthWeightTotal += input;
					lowBirthWeightInputTotal++;
				}
				// if the input is in the range of normal birth weight, add it to the accumulator. Also add to the Input total accumulator.
				else if (input >= 2500) {
					normalBirthWeightTotal += input;
					normalBirthWeightInputTotal++;
				}
			}

			// Add each weights total together.
			totalWeights = extremelyLowBirthWeightTotal + veryLowBirthWeightTotal + lowBirthWeightInputTotal + normalBirthWeightTotal;
			// Add each input total to the totalWeightInputs accumulator.
			totalWeightInputs = extremelyLowBirthWeightInputTotal + veryLowBirthWeightInputTotal + lowBirthWeightInputTotal + normalBirthWeightInputTotal; 

			// check if any of the weights total is 0, if so make each weights average equal to 0.
			// getting a NaN(Not a Number) return value when dividing 0 by 0.
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

			// Calculate the percentage of each weight category.
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
		// Display an error message if no weights were entered.
		else {
			System.out.println("No weights were entered.");
		}
	}
}
