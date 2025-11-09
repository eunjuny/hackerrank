import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();

            // %-15s → 문자열을 왼쪽 정렬, 폭 15칸 확보
            // %03d   → 정수를 3자리로 표현, 부족한 자리 0으로 채움
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");

        sc.close();
    }
}
