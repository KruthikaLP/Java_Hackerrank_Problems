import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
         NumberFormat inFormat = NumberFormat.getCurrencyInstance(new Locale("en","in"));
         NumberFormat chFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
         NumberFormat frFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        System.out.println("US: " + usFormat.format(payment));
        System.out.println("India: " + inFormat.format(payment));
        System.out.println("China: " + chFormat.format(payment));
        System.out.println("France: " + frFormat.format(payment));
    }
}
