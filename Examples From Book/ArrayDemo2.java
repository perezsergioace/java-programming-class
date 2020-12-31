import java.util.Scanner;

/**
 * This program shows an array being processed with loops. */

public class ArrayDemo2 {
    public static void main(String[] args) {
        final int EMPLOYEES = 3;
        int[] hours = new int[EMPLOYEES];

        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the hours worked by " + EMPLOYEES + " employees.");

        // Get the hours for each employee.
        for (int index = 0; index < EMPLOYEES; index++) {
            System.out.print("Employee " + (index + 1) + ": ");
            hours[index] = keyboard.nextInt(); 
        }

        System.out.println("The hours you entered are:");
        
       // Display the values entered. 
        for (int index = 0; index < EMPLOYEES; index++) {
            System.out.println(hours[index]);
        }
    }
}
