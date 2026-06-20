// Star Pyramid Pattern

import java.util.*;
public class starpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n no. : ");
        int n = sc.nextInt();
        int starN = 1;
        for(int line = n; line >= 1; line --){
            for(int space = 1; space <= (line - 1); space ++){
                System.out.print("  ");
            }
            for(int star = 1; star <= starN; star ++){
                System.out.print("* ");
            }
            starN = starN + 2;
        System.out.println();
        }
    }
}
