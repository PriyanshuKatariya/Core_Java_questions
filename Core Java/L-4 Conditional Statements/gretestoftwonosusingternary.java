/* 7 Ternary Operators */

import java.util.*;
public class gretestoftwonosusingternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no. : ");
        int a = sc.nextInt();
        System.out.print("Enter second no. : ");
        int b = sc.nextInt();

        int larger = (a>b)?a:b;
        System.out.println("Gretest no. is :" + larger);    
    }
}
