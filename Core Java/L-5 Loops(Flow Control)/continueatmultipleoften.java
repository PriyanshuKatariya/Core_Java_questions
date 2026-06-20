/* 14 Display all numbers entered by user except multiples of 10 */

import java.util.*;

public class continueatmultipleoften {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter no. : ");
            int num = sc.nextInt();

            if(num % 10 == 0){
                continue;
            }
            System.out.println(num);
        }while(true);
    }
}
