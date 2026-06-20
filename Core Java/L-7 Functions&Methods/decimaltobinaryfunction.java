/* 20 Decimal to Binary */

public class decimaltobinaryfunction {
    public static void dectobin(int n){
        int saveddecnum = n;
        int power = 0;
        int binnum = 0;

        while(n > 0){
            int rem = n % 2;
            binnum = binnum + (rem * (int)Math.pow(10,power));
            power ++;
            n = n / 2;
        }

        System.out.println("Binary of " + saveddecnum + " : " + binnum);
    }

    public static void main(String[] args) {
        dectobin(137);
    }
}
