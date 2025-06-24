
/**
 * SortedLinkedList.java
 *
 * A utility program that reads a list of integers from user input,
 * stores them in a LinkedList, sorts them in ascending order, and
 * prints the sorted list to the console.
 *
 * Steps to Compile, Run, and Generate Javadoc:
 * --------------------------------------------
 * 1. Save this file as SortedLinkedList.java
 * 2. Open a terminal/command prompt and navigate to the file's directory.
 * 3. Compile the program:
 *      javac SortedLinkedList.java
 * 4. Run the program:
 *      java SortedLinkedList
 * 5. To generate Javadoc documentation:
 *      javadoc SortedLinkedList.java
 *
 * Note:
 * - On input, enter integers separated by spaces.
 * - Use Ctrl+D (Linux/macOS) or Ctrl+Z (Windows) after input to signal EOF.
 *
 * Example:
 * Input:  3 1 4 1 5 9
 * Output: Sorted list: [1, 1, 3, 4, 5, 9]
 *
 * Author: Ryan
 */

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Main class that handles input, sorting, and output.
 */
public class SortedLinkedList {

    /**
     * Reads integers from the user, sorts them, and displays the sorted list.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Enter integers separated by spaces. Press Enter then Ctrl+D (or Ctrl+Z on Windows) to finish:");

        // Read input
        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }

        // Sort the linked list
        Collections.sort(numbers);

        // Display sorted list
        System.out.println("Sorted list: " + numbers);
    }
}
