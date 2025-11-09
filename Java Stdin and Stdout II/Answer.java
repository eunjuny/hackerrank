import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // read everything as a line
        String intLine = sc.nextLine();
        String doubleLine = sc.nextLine();
        String stringLine = sc.nextLine();

        sc.close();

        // convert manually
        int i = Integer.parseInt(intLine);
        double d = Double.parseDouble(doubleLine);
        String s = stringLine;

        // output
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
