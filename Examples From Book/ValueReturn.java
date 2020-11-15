public class ValueReturn
{
	public static void main(String[] args)
	{
		int total, value1 = 20, value2 = 40;
		
		// Call the sum method, passing the contents of value1 and value2 as arguments. 
		// Assign the return value to the total variable
		total = sum(value1, value2);

		// Display the contents of all these variables
		System.out.println("The sum of " + value1 + " and " + value2 + " is " + total);
	}

	public static int sum(int num1, int num2)
	{
		int result;	// result is a local variable

		// Assign the value of num1 + num2 to result.
		result = num1 + num2;

		// Return the value in the result variable.
		return result;
	}
}
