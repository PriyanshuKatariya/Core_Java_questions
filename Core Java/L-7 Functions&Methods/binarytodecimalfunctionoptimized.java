/* Binary to Decimal optimized(solved starting zeros at binary number problem) */

public class binarytodecimalfunctionoptimized {
    public static void bintodec(String binstr) {
        int power = 0;
        int decnum = 0;
        
        for (int i = binstr.length() - 1; i >= 0; i--) {
            char bit = binstr.charAt(i);
            if (bit == '1') {
                decnum += (int) Math.pow(2, power);
            }
            power++;
        }

        System.out.println("Decimal of " + binstr + " : " + decnum);
    }

    public static void main(String[] args) {
        bintodec("00111010"); 
    }
}

