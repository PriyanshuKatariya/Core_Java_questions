/* 6 Print the largest of 3 numbers */

import java.util.*;
public class largestofthreenos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no. : ");
        int a = sc.nextInt();
        System.out.print("Enter second no. : ");
        int b = sc.nextInt();
        System.out.print("Enter third no. : ");
        int c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(a + ": is greatest");
            }
            else{
                System.out.println(c + ": is greatest");
            }
        }
        else if(b>c){
            System.out.println(b + ": is greatest");
        }
        else{
            System.out.println(c + ": is greatest");
        }
    }
}
