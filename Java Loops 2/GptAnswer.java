import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  // number of test cases

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int sum = a;
            int power = 1;  // 2^0

            // build and print sequence
            for (int i = 0; i < n; i++) {
                sum += power * b;      // add current term
                System.out.print(sum + " ");
                power *= 2;            // next term: multiply by 2 (2^i)
            }
            System.out.println();      // move to next line
        }

        sc.close();
    }
}
