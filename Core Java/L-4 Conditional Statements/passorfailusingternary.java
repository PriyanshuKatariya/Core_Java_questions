/* 8 Check if a student will Pass or Fail */

import java.util.*;
public class passorfailusingternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks = sc.nextInt();

        String result = marks>=33?"Pass":"Fail";
        System.out.println("Your result is : " + result);
    }
}
