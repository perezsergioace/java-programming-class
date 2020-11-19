import java.util.Scanner;	// Needed for the Scanner class
import java.io.*;		// Needed for the File and IOException

/**
 * This program reads book price data from a file, performs some computations, and displays a table of cost data.
 */

public class BookPriceData
{
	public static void main(String[] args) throws IOException
	{
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the file name.
		System.out.print("What is the name of the file? ");
		String filename = keyboard.nextLine();

		// Make sure the file exists.
		File file = new File(filename);
		if (!file.exists())
		{
			System.out.printf("The file %s was not found.\n", file);
		}

		// Cannot use System.exit
		if (file.exists() != false)
		{
			// Open the file.
			Scanner inputFile = new Scanner(file);

			// Read lines from the file until no more are left.
			while (inputFile.hasNext())
			{
				// Read the next line of data
				String bookDataLine = inputFile.nextLine();

				// Display the last line of book data
				System.out.println(bookDataLine);
			}

			// Close the file.
			inputFile.close();

		}
	}
}
