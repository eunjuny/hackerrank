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
        String one = str.split(" ")[0];
        String two = str.split(" ")[1];
        
        int i = one.length();
        int j = Integer.parseInt(two);
        while(15 > i) {
           one = one + " ";
           i++;
        }
        if (j < 10) {
            two = "00" + two;
        } else if (j < 100) {
            two = "0" + two;
        }
        
        return one + two;
    }
}
