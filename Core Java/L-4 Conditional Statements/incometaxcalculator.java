/* 5 Income tax calculator */

import java.util.*;
public class incometaxcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income : ");
        int income = sc.nextInt();
        
        if(income <= 500000){
            System.out.println("Income tax : 0");
        }
        else if (income > 500000 && income <= 1000000) {
            System.out.println("Income tax " + income*0.20);
        }
        else if(income > 1000000){
            System.out.println("Income tax " + income*0.30);
        }
    }
}
