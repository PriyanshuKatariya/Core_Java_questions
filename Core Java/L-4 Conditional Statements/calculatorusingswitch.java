/* 10 Calculator */

import java.util.*;

public class calculatorusingswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter operator : ");
        char operator = sc.next().charAt(0);
        
        switch(operator) {
            case '+' : System.out.println("Addition of a and b is : " + (a + b));
                        break;
            case '-' : System.out.println("Subtraction of a and b is : " + (a - b));
                        break;
            case '*' : System.out.println("Multiplication of a and b is : " + (a * b));
                        break;
            case '/' : System.out.println("Division of a and b is : " + (a / b));
                        break;
            case '%' : System.out.println("Modulo of a and b is : " + (a % b));
                        break;
            default : System.out.println("Wrong operator");
        }
    }
}
