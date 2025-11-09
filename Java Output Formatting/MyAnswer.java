import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        System.out.println("================================");
        while(sc.hasNext()) {
            System.out.println(setOutput(sc.nextLine()));
        }
        System.out.println("================================");
    }
    
    private static String setOutput(String str) {
        String[] parts = str.trim().split("\\s+");
        String word = parts[0];
        int num = Integer.parseInt(parts[1]);
        return String.format("%-15s%03d", word, num);
    }

}
