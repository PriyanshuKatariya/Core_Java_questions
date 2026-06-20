// Hollow Rhombus Pattern

import java.util.*;
public class hollowrhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows no. : ");
        int rows = sc.nextInt();
        System.out.print("Enter cols no. : ");
        int cols = sc.nextInt();
        int n = cols-1;
        for(int line = 1; line <= rows; line ++){
            for(int space = 1; space <= n; space ++){
                System.out.print("  ");
            }
            n --;
            for(int star = 1; star <= cols; star ++){
                if(line == 1 || line == rows || star == 1 || star == cols){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
        System.out.println();
        }
    }
}