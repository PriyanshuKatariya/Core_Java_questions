/* 14 Check if a number is prime or not  */

public class primeornotusingfunction {
    public static boolean Primeornot(int n){
        boolean isPrime = true;
        for(int i = 2; i <= n - 1; i ++){
            if(n % i == 0){
                isPrime = false;
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {
        System.out.println(Primeornot(8));
    }
}
