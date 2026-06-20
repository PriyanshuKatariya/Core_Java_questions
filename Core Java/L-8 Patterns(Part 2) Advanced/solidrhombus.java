// Solid Rhombus Pattern

public class solidrhombus {
    public static void main(String[] args) {
        for(int line = 5; line >= 1; line --){
            for(int space = 1; space <= (line-1); space ++){
                System.out.print("  ");
            }
            for(int star = 1; star <= 5; star ++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
