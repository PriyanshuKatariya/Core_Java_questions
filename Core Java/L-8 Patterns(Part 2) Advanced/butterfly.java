// 6-butterfly pattern

import java.util.*;
public class butterfly {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n : ");
    int n = sc.nextInt();
        for(int line = 1; line <= n; line ++){
            for(int stars = 1; stars <= line; stars ++){
                System.out.print("* ");
            }
            for(int space = 1; space <= 2*(n-line); space ++){
                System.out.print("  ");
            }
            for(int stars = 1; stars <= line; stars ++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int line = n; line >= 1; line --){
            for(int stars = 1; stars <= line; stars ++){
                System.out.print("* ");
            }
            for(int space = 1; space <= 2*(n-line); space ++){
                System.out.print("  ");
            }
            for(int stars = 1; stars <= line; stars ++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
