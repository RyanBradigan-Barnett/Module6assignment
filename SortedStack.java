
/**
 * SortedStack.java
 *
 * This program is a maintenance update of the previous "SortedLinkedList" project.
 * It now uses a Stack instead of a LinkedList while preserving the structure and logic.
 *
 * The program reads integers from user input, stores them in a Stack,
 * sorts the Stack in ascending order, and prints the sorted Stack.
 *
 * Steps to Compile, Run, and Generate Javadoc:
 * --------------------------------------------
 * 1. Save this file as SortedStack.java
 * 2. Open a terminal/command prompt and navigate to the file's directory.
 * 3. Compile the program:
 *      javac SortedStack.java
 * 4. Run the program:
 *      java SortedStack
 * 5. To generate Javadoc documentation:
 *      javadoc SortedStack.java
 *
 * Note:
 * - Input integers separated by spaces.
 * - Use Ctrl+D (Linux/macOS) or Ctrl+Z (Windows) after input to signal end of input.
 *
 * Example:
 * Input:  8 3 5 1
 * Output: Sorted stack: [1, 3, 5, 8]
 *
 * Author: Ryan
 */

import java.util.Scanner;
import java.util.Stack;
import java.util.Collections;

/**
 * Main class that reads input, stores values in a Stack,
 * sorts it, and prints the result.
 */
public class SortedStack {

    /**
     * Reads integers from the user, stores them in a Stack,
     * sorts the Stack, and displays the result.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // === Reused Code: Changed from LinkedList to Stack ===
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        // === Reused Code: Input prompt and loop ===
        System.out.println(
                "Enter integers separated by spaces. Press Enter then Ctrl+D (or Ctrl+Z on Windows) to finish:");

        while (scanner.hasNextInt()) {
            stack.push(scanner.nextInt()); // Changed .add() to .push()
        }

        // === Reused Code: Sorting using Collections ===
        Collections.sort(stack);

        // === Reused Code: Output statement ===
        System.out.println("Sorted stack: " + stack);
    }
}
