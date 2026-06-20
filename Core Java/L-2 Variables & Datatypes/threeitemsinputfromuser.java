/* Enter cost of 3 items from the user(usingfloatdatatype) - a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */

import java.util.*;
public class threeitemsinputfromuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost of a pencil :");
        float pencil = sc.nextFloat();
        System.out.print("Enter cost of a pen :");
        float pen = sc.nextFloat();
        System.out.print("Enter cost of a eraser :");
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        float gsttotal = total + (0.18f*total);
        System.out.println("Bill of pencil, pen & eraser including 18% GST is :" + gsttotal);
    }
}
