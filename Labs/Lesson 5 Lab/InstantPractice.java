import java.time.Instant;
import java.util.Scanner;
/**
    Instant practice
*/
public class InstantPractice {
    public static void main(String[] args) {
		// Create an instant
        Instant now = Instant.now();
		
		// Delay a bit -- press enter after a number of seconds has passed
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Enter your name: ");
		String delay = keyboard.nextLine();
		
		// Make another instant, now that you've delayed
		Instant later = Instant.now();
		
		// Print the two times
		System.out.println(now.toString());
		System.out.println(later.toString());
		
		// Subtract the first time (as seconds) from the second time to get the difference
		long nowSeconds = now.getEpochSecond();
		Instant difference = later.minusSeconds(nowSeconds);
		System.out.println(difference.getEpochSecond());		

    }
}
