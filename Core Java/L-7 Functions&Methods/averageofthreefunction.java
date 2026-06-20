/* Q-1 Write a Java method to compute the averageof three numbers. */

public class averageofthreefunction {
    public static int avgofthree(int a, int b, int c){
        int average;
        average = (a + b + c) / 3;
        System.out.println("Average of " + a + " " + b + " " + c + " : " + average);
        return 3;
    }

    public static void main(String[] args) {
        avgofthree(3, 5, 8);
    }
}
