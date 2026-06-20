/* 18 Binary to Decimal */

public class binarytodecimalfunction {
    public static void bintodec(int binnum){
        int savedbinnum = binnum;
        int power = 0;
        int decnum = 0;

        while(binnum > 0 ){
            int lastdigit = binnum % 10;
            decnum = decnum + (lastdigit * (int)Math.pow(2, power));

            power ++;
            binnum = binnum / 10;
        }

        System.out.println("Decimal of " + savedbinnum + " : " + decnum);
    }

    public static void main(String[] args) {
        bintodec(1110101);
    }
}
