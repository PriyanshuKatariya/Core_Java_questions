/* 9 Binomial Coefficient */

public class binomialcoefficientfunction {
    public static int factorial(int n) {
        int f = 1;

        for(int i = 1; i <= n; i ++){
            f = f * i;
        }

        return f;
    }

    public static int binomialcoefficient(int n, int r) {
        int factorail_n = factorial(n);
        int factorail_r = factorial(r);
        int factorial_nminusr = factorial(n - r);

        int result = factorail_n / (factorail_r * factorial_nminusr);

        return result;
    }

    public static void main(String[] args) {
        int finalresult;
        finalresult = binomialcoefficient(5, 2);
        System.out.println(finalresult);
    }
}
