import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int H = sc.nextInt();
        
        try {
            int ans = B * H;
            if(B <= 0 || H <= 0) {
                throw new Exception("java.lang.Exception: Breadth and height must be positive");
            } else {
                System.out.println(ans);
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
