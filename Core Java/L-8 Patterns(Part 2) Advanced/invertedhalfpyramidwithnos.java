/* 3-inverted half pyramid pattern with numbers */

public class invertedhalfpyramidwithnos {
    public static void main(String[] args) {
        for(int line = 5; line >= 1; line --){
            for(int num = 1; num <= line; num ++){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
