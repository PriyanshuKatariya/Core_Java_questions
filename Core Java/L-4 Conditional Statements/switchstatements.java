/* 9 Switch Statements */

import java.util.*;

public class switchstatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();

        switch (number) {
            case 1 : System.out.println("Samosa");
                        break;
            case 2 : System.out.println("Momos");
                        break;
            case 3 : System.out.println("Burger");
                        break;
            case 4 : System.out.println("Pasta");
                        break;
            default: System.out.println("We wake up");
        }
    }
}
