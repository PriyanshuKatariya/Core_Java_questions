/* 12 Overloading using parameters */

public class overloadingusingparameters {
    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }

    public static void main(String[] args) {
        int result;
        result = sum(5, 7, 10, 6);
        System.out.println(result);
    }
}
