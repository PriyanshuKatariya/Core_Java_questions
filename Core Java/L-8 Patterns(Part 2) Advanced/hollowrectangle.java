// 1-hollow rectangle pattern

import java.util.*;
public class hollowrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int totrows = sc.nextInt();
        System.out.print("Enter no. of columns : ");
        int totcols = sc.nextInt();
        for(int i = 1; i <= totrows; i++){
            for(int j = 1; j <= totcols; j++){
                if(i == 1 || i == totrows || j == 1 || j == totcols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }   
    }
}
