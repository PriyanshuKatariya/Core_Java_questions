/* 13 Continue Statement */

public class continuekeyword {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i = i + 1){
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }
    }    
}
