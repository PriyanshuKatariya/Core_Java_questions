/* 2 Print the largest of 2 numbers */

import java.util.*;
public class largestoftwonos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        
        if(num1 > num2){
            System.out.println(num1 + " num1 is greatest");
        }
        // if(num1 == num2){
        //     System.out.println("Both are equal");
        // }
        else{
            System.out.println(num2 + " num2 is greatest");
        }
    }
}
