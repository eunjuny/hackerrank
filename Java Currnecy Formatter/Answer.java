import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    // 기존에는 java17로 풀이를 했는데, 이 문제는 java17로 할 경우 통과가 안돼서 8버전으로 진행함.
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment); 
        
        Locale indiaCustomLocale = new Locale("en", "IN"); 
        
        String india = NumberFormat.getCurrencyInstance(indiaCustomLocale).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
