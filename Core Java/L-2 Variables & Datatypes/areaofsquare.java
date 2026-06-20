/* Q-2 In a program, input the side of a square. You have to output the area of the square.(Hint : area of a square is (side x side)) */

import java.util.*;
public class areaofsquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of the square :");
        float side = sc.nextFloat();
        float area = side*side;
        System.out.println("Area of the square is :" + area);
    }
}
