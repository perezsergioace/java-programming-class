import java.util.Scanner; // Needed for the Scanner class
import java.io.*; // Needed for the File and IOException

/**
 * This program reads book price data from a file, performs some computations,
 * and displays a table of cost data.
 */

public class BookPriceData {
	public static void main(String[] args) throws IOException {
		// Create Variables
		String sellerTitle = "Seller";
		String qualityTitle = "Quality";
		String costTitle = "Cost";
		String costShippingTitle = "Cost + Shipping";
		double baseCost = 0;

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the file name.
		System.out.print("What is the name of the file? ");
		String filename = keyboard.nextLine();

		// Make sure the file exists.
		File file = new File(filename);
		if (!file.exists()) {
			System.out.printf("The file %s was not found.\n", file);
		}

		// Cannot use System.exit
		if (file.exists() != false) {
			// Open the file.
			Scanner inputFile = new Scanner(file);

			// Check if the file is empty
			if (!inputFile.hasNext()) {
				System.out.printf("%s is empty\n", file);
			}
			// else validate some information about the text file.
			else {
				// check for the title of the book
				if (inputFile.hasNext()) {
					System.out.println("Title: " + inputFile.nextLine());
					// check if there is a price of the book in the next line
					if (inputFile.hasNextDouble()) {
						baseCost = inputFile.nextDouble();
					}
					if (inputFile.hasNext()) {							
						System.out.println("Next Line?");
					}
					else {
						System.out.println("There are no copies.");
					}

					inputFile.nextLine();
				}

				System.out.printf("%-30s%-20s%-20s%-20s\n", sellerTitle, qualityTitle, costTitle, costShippingTitle);
				// Read lines from the file until no more are left.
				while (inputFile.hasNext()) {
					if (inputFile.hasNext("BestBookDeals") || inputFile.hasNext("UsedTextbooksRUs")
							|| inputFile.hasNext("JohnsScienceBooks") || inputFile.hasNext("ValueBookorama")
							|| inputFile.hasNext("A1BookSellers") || inputFile.hasNext("AlreadyUnderlined")
							|| inputFile.hasNext("QualityBooks") || inputFile.hasNext("BooksBooksBooks")) {

						String bookSellerName = inputFile.nextLine();
						// System.out.println(bookSellerName);

						// Get shipping cost from the file
						if (inputFile.hasNextDouble()) {
							double shippingCost = inputFile.nextDouble();
							// System.out.println(shippingCost);

							if (inputFile.hasNextInt()) {
								int qualityOfBook = inputFile.nextInt();

								if (qualityOfBook == 1) {
									System.out.printf("%-30s%-20s%-20.2f%-20.2f\n", bookSellerName,
											getQualityString(qualityOfBook), calculateCost(baseCost, qualityOfBook),
											calculateCostAndShipping(calculateCost(baseCost, qualityOfBook),
													qualityOfBook, shippingCost));
								} else if (qualityOfBook == 2) {
									System.out.printf("%-30s%-20s%-20.2f%-20.2f\n", bookSellerName,
											getQualityString(qualityOfBook), calculateCost(baseCost, qualityOfBook),
											calculateCostAndShipping(calculateCost(baseCost, qualityOfBook),
													qualityOfBook, shippingCost));
								} else if (qualityOfBook == 3) {
									System.out.printf("%-30s%-20s%-20.2f%-20.2f\n", bookSellerName,
											getQualityString(qualityOfBook), calculateCost(baseCost, qualityOfBook),
											calculateCostAndShipping(calculateCost(baseCost, qualityOfBook),
													qualityOfBook, shippingCost));
								} else if (qualityOfBook == 4) {
									System.out.printf("%-30s%-20s%-20.2f%-20.2f\n", bookSellerName,
											getQualityString(qualityOfBook), calculateCost(baseCost, qualityOfBook),
											calculateCostAndShipping(calculateCost(baseCost, qualityOfBook),
													qualityOfBook, shippingCost));
								} else if (qualityOfBook == 5) {
									System.out.printf("%-30s%-20s%-20.2f%-20.2f\n", bookSellerName,
											getQualityString(qualityOfBook), calculateCost(baseCost, qualityOfBook),
											calculateCostAndShipping(calculateCost(baseCost, qualityOfBook),
													qualityOfBook, shippingCost));
								}
							}
						}
					}

					inputFile.nextLine();
				}

				// Close the file.
				inputFile.close();
			}
		}
	}

	public static double calculateCost(double baseCost, int qualityOfBook) {
		double result = 0;
		if (qualityOfBook == 1.0) {
			result = baseCost;
		} else if (qualityOfBook == 2.0) {
			result = baseCost - (20.99 * 0.10);
		} else if (qualityOfBook == 3.0) {
			result = baseCost - (20.99 * 0.20);
		} else if (qualityOfBook == 4.0) {
			result = baseCost - (20.99 * 0.25);
		} else if (qualityOfBook == 5.0) {
			result = baseCost - (20.99 * 0.30);
		}

		return result;
	}

	public static String getQualityString(int qualityOfBook) {
		String result = "";

		if (qualityOfBook == 1) {
			result = "New";
		} else if (qualityOfBook == 2) {
			result = "Like New";
		} else if (qualityOfBook == 3) {
			result = "Very Good";
		} else if (qualityOfBook == 4) {
			result = "Good";
		} else if (qualityOfBook == 5) {
			result = "Acceptable";
		}

		return result;
	}

	public static double calculateCostAndShipping(double baseCost, int qualityOfBook, double shippingAmount) {
		double result = 0;
		if (qualityOfBook == 1) {
			result = baseCost + shippingAmount;
		} else if (qualityOfBook == 2) {
			result = baseCost + shippingAmount;
		} else if (qualityOfBook == 3) {
			result = baseCost + shippingAmount;
		} else if (qualityOfBook == 4) {
			result = baseCost + shippingAmount;
		} else if (qualityOfBook == 5) {
			result = baseCost + shippingAmount;
		}

		return result;
	}
}
