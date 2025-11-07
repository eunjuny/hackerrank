import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try(Scanner sc = new Scanner(System.in)) {
            List<String> inputs = new ArrayList<>();
            while(sc.hasNext()) {
                inputs.add(sc.next());
            }
            inputs.forEach(e -> System.out.println(e));
        }
    }
}
