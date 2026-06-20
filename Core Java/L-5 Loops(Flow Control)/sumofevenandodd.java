/* Q-2 Write a program that reads a set of integers, and then prints the sum of the even and odd integers */

import java.util.*;

public class sumofevenandodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. : ");
        int num = sc.nextInt();
        int even = 0;
        int odd = 0;

        while(num > 0){
            int lastdigit = num % 10;
            if(lastdigit % 2 == 0){
                even = even + lastdigit;
            }
            else{
                odd = odd + lastdigit;
            }
            num = num / 10;
        }
    System.out.println("Sum of even no's is : " + even);
    System.out.println("Sum of odd no's is : " + odd);
    }
}
