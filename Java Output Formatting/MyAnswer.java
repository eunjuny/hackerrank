import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Read input from STDIN and print formatted output to STDOUT */

        Scanner sc = new Scanner(System.in);

        // Print the top border line
        System.out.println("================================");

        // Read each line until there is no more input
        while (sc.hasNext()) {
            String line = sc.nextLine();

            // Skip blank or empty lines
            if (!line.isBlank()) {
                // Format the current line and print the result
                System.out.println(setOutput(line));
            }
        }

        // Print the bottom border line
        System.out.println("================================");

        sc.close();
    }

    // Helper method to format a single line according to the required pattern
    private static String setOutput(String str) {
        // Remove extra spaces at both ends and split by one or more spaces
        String[] parts = str.trim().split("\\s+");

        // First element is the string, second is the integer
        String word = parts[0];
        int num = Integer.parseInt(parts[1]);

        /*
         * %-15s : left-align the string and reserve 15 characters of space
         * %03d   : print the integer in 3 digits, pad with zeros if necessary
         * Example: "java 100" -> "java           100"
         *          "cpp 65"  -> "cpp            065"
         */
        return String.format("%-15s%03d", word, num);
    }
}
