import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args) {
        double salary;
        double yearsOnJob;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your annual salary: ");
        salary = keyboard.nextDouble();

        System.out.print("Enter the number of years at your current job: ");
        yearsOnJob = keyboard.nextDouble();

        if (salary >= 50000) {
            if (yearsOnJob >= 2) {
                System.out.println("You qualify for the loan.");
            } else {
                System.out.println("You must have been on your current job for at least two years to qualify.");
            }
        } else {
            System.out.println("You must ear at least $50,000 per year to qualify.");
        }

    }
}
