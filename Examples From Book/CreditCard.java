import javax.swing.JOptionPane;

/**
 * This program uses two void methods.
 */

public class CreditCard
{
	public static void main(String[] args){
		double salary;
		int creditRating;
		String input;

		// Get the user's annual salary.
		input = JOptionPane.showInputDialog("What is your annual salary?");
		salary = Double.parseDouble(input);

		// Get the user's credit rating (1 through 10).
		input = JOptionPane.showInputDialog("On a scale of 1 through 10, what is your credit rating? (10 = excellent, 1 = very bad)");
		creditRating = Integer.parseInt(input);

		// Determine whether the user qualifies.
		if (salary >= 2000 && creditRating >= 7)
			qualify();
		else
			noQualify();

		System.exit(0);

	}
		/**
		 * The qualify method inform the user that he or she qualifies for the credit card. 
		 */

		public static void qualify() {
			JOptionPane.showMessageDialog(null, "Congratulations! You qualify for the credit card!");
		}

		/**
		 * The noQualify method informs thee user that he or she does not qualify for thee credit card. */

		public static void noQualify() {
			JOptionPane.showMessageDialog(null, "I'm sorry. You do not qualify for the credit card.");
		}
}
