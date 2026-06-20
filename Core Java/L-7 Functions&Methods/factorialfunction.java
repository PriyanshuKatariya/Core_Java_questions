/* 8 Factorail */

public class factorialfunction {
    public static int factorail(int n) {
        int f = 1;

        for(int i = 1; i <= n; i ++){
            f = f * i;
        }

        return f;
    }

    public static void main(String[] args) {
        int answer;
        answer = factorail(7);
        System.out.println(answer);
    }
}
