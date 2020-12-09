import java.io.*;
import java.util.concurrent.Callable;

/*
 * This class borrowed mostly from https://www.javaspecialists.eu/archive/Issue153.html
 * Modifications made for the TriviaQuiz problem.
 */

public class ConsoleInputReadTask implements Callable<String> {
  public String call() throws IOException {
    BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in));
    String input;
    do {
      System.out.print("Please enter the number of your answer: ");
      try {
        // wait until we have data to complete a readLine()
        while (!br.ready()) {
          Thread.sleep(100);
        }
        input = br.readLine();
      } catch (InterruptedException e) {
        return null;
      }
    } while ("".equals(input));
    return input;
  }
}