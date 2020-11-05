import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args){
        int counter = 1;
        int number;
        int largest = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number: ");
        number = keyboard.nextInt();
        
        while(counter < 5){
            System.out.println("Enter the number: ");
            number = keyboard.nextInt();

            if (largest < number) {
                largest = number;
            }

            counter++;
        }

        System.out.print("the largest number is " + largest);
    }    
}
