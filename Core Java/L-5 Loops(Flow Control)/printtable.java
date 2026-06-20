/* Q-4 Write a program to print the multiplication table of a number N, entered by the user. */

import java.util.*;

public class printtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which no's table you want to print : ");
        int tableof = sc.nextInt();
        int counter = 1;
        while(counter <= 10) {
            System.out.println(tableof + " * " + counter + " = " + counter * tableof);
            counter = counter + 1;
        }
    }
}
