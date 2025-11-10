import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int cnt = sc.nextInt();
        
        for (int i = 0; i < cnt; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            
            int ans = a;
            int num = 1;
            for (int j = 0; j < n; j++) {
                ans += num * b;
                System.out.print(ans + " ");
                num *= 2;
            }
            System.out.println();
        }
        sc.close();
    }
}
