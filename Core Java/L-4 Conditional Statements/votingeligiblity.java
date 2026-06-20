/* Eligible for vote or not */

import java.util.*;
public class votingeligiblity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Eligibler for vote");
        }
        else{
            System.out.println("Not elegible for vote");
        }
    }    
}
