/* Q-2 Write a method named isEven that accepts an int argument.The method should return true if the argument is even, or false otherwise.Also write a program to test your method. */

public class isevenfunction {
    public static int iseven(int a){
        boolean result;
        if(a % 2 == 0){
            result = true;
        }
        else{
            result = false;
        }

        System.out.println(result);
        return 0;
    }

    public static void main(String[] args) {
        iseven(6);
    }
}
