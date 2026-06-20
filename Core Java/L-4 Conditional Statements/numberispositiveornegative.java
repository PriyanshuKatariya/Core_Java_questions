/* Q-1 Write a Java program to get a number from the user and print whether it is positive or negative. */

import java.util.*;

public class numberispositiveornegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        
        if(num >= 0){
            if(num == 0){
                System.out.println(num + " is Zero");
            } else {
                System.out.println(num + " is Positive");
            }
        } else {
            System.out.println(num + " is Negative");
        }

    }
}
