import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        System.out.println(isWeird(N) ? "Weird" : "Not Weird");
    }
    
    private static boolean isWeird(int n) {
        if (n%2 == 1) {
            return true;
        } else if (n >= 2 && n <= 5) {
            return false;
        } else if (n >= 6 && n <= 20) {
            return true;
        } else {
            return false;
        }
    }
}
