// 5-binary triangle pattern
public class binarytriangle {
    public static void main(String[] args) {
        for(int line = 1; line <= 5; line ++){
            for(int col = 1; col <= line; col ++){
                if((line + col) % 2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}