/* 5 Sum of first N natural numbers */

import java.util.*;

public class sumoffirstnnaturalnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n no : ");
        int n = sc.nextInt();
        int counter = 1;
        int sum = 0;
        
        while(counter <= n){
            sum = sum + counter;
            counter = counter + 1;
        }
            System.out.println("Sum of first n natural no's is : " + sum);
    }
}
