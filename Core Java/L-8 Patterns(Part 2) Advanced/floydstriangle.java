// 4-floyd's triangle pattern

public class floydstriangle {
    public static void main(String[] args) {
        int increasingno = 1;
        for(int line = 1; line <= 5; line ++){
            for(int num = 1; num <= line; num ++){
                System.out.print(increasingno + " ");
                increasingno ++;
            }
            System.out.println();
        }
    }
}
