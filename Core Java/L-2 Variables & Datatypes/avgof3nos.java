/* Q-1 In a program, input 3 numbers: A, B and C.You have to output the average of these 3 numbers.(Hint : Average of N numbers is sum of those numbers divided by N) */

import java.util.*;
public class avgof3nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no. :");
        int A = sc.nextInt();
        System.out.print("Enter second no. :");
        int B = sc.nextInt();
        System.out.print("Enter third no. :");
        int C = sc.nextInt();
        int avg = (A+B+C)/3;
        System.out.println("Average of 3 no's is :" + avg);
    }
}
