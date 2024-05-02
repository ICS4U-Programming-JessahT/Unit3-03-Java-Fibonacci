import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Program that reads file and outputs fibonacci sequence.
 *
 * @author Jessah
 * @version 1.0 @2024-04-24
 */
public final class Fibonacci {

  /** Private constructor to prevent instantiation of this utility class. */
  private Fibonacci() {
    // whitespace
  }

  /**
   * Reverses the order of strings.
   *
   * @param sequence Reads contents of input and uses fib sequence.
   * @return Returns by calling recursive function or empty variable.
   */
  public static int recFibonacci(int sequence) {

    // Check if below or equal to 0.
    if (sequence <= 0) {
      return 1;
    } else if (sequence == 1) {
      // Check if equal to 1.
      return 1;
    } else {
      // subtract the last two terms and add together.
      return recFibonacci(sequence - 1) + recFibonacci(sequence - 2);
    }
  }

  /**
   * Main program.
   *
   * @param args Command-line arguments (not used in program).
   * @throws IOException
   *
   */

  // Main program.
  public static void main(final String[] args) throws IOException {

    // Create file for input.
    final File inputFile =
     new File("Unit3/Unit3-03/Unit3-03-Java-Fibonacci/input.txt");
    // Create scanner to scan input.
    final Scanner input = new Scanner(inputFile);

    // Create file for output.
    final File outputFile =
     new File("Unit3/Unit3-03/Unit3-03-Java-Fibonacci/output.txt");
    // Allow to file write onto output file.
    final FileWriter output = new FileWriter(outputFile);

    try {
    // Checks if file has contents.
    if (input.hasNextLine()) {
      // Declare contents as string to pass to function.
      final String line = input.nextLine();
      // Convert string to int.
      final int fact = Integer.parseInt(line);
      // Call recursive function.
      final int Fibonacci = recFibonacci(fact);
      // Convert back to string to write.
      final String stringFact = Integer.toString(Fibonacci);
      output.write(stringFact);
    } else {
      // If there is nothing in the file.
      System.out.println("There is nothing in the file.");
    }
  } catch (NumberFormatException error) {
    // If user inputs a string.
    System.out.println("String cannot be factorized.");

  }
    // Close input and output file.
    input.close();
    output.close();

    // Display when finished file reading.
    System.out.println("File reading is finished.");
  }
}
