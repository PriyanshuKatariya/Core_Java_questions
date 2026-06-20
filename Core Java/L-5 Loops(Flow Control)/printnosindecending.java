/* #7 Print numbers in decending order */

import java.util.*;

public class printnosindecending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        
            for(int num = sc.nextInt(); num >= 1; num = num-1){
                System.out.println(num);
            }
    }
}
