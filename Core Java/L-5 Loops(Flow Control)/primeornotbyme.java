/* 15 Check if a number is prime or not by me */

import java.util.*;

public class primeornotbyme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. : ");
        int num = sc.nextInt();
        int div = 2;
            while(div <= num){
                if (div == num){
                    System.out.println("Prime");
                    break;
                }
                else if(num % div == 0){
                    System.out.println("Not Prime");
                    break;
                }
                else{
                    div = div + 1;
                }
            }
    }
}
