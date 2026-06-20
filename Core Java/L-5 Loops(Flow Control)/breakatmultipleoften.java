/* 12 Keep entering numbers till user enters a multiple of 10 */

import java.util.*;

public class breakatmultipleoften {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter no. : ");
            int num = sc.nextInt();

            if(num % 10 == 0){
                break;
            }
            System.out.println(num);
        }while(true);
    }
}
