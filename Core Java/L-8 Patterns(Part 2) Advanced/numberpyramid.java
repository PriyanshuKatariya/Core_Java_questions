// Number Pyramid Pattern

import java.util.*;
public class numberpyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n no. : ");
        int n = sc.nextInt();
        int spaceN = n-1;
        for(int line = 1; line <= n; line ++){
            for(int space = 1; space <= spaceN; space ++){
                System.out.print(" ");
            }
            spaceN --;
            for(int star = 1; star <= line; star ++){
                System.out.print(line + " ");
            }
        System.out.println();
        }
    }
}
