// 2-inverted and rotated half pyramiid pattern

import java.util.*;
public class invertedandrotatedhalfpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter line no. : ");
        int lineno = sc.nextInt();
        for(int line = 1; line <= lineno; line ++){
            for(int space = lineno; space > line; space --){
                System.out.print("  ");
            }
            for(int star = 1; star <= line; star ++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}
