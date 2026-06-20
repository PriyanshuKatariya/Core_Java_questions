/* 13 Overloading using data types */

public class overloadingusingdatatypes {
    public static int sum(int a, int b){
        return a + b;
    }

    public static float sum(float a, float b){
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(7.2f, 5.6f)); 
    }
}
