/**Write a program to print the color name, based on color code.
 * If color code in not valid then print "Invalid Code". 
 * R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White. */


import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        switch (str) {
            case "R": System.out.println(str+"->Red"); break;
            case "B": System.out.println(str+"->Blue"); break;
            case "G": System.out.println(str+"->Green"); break;
            case "O": System.out.println(str+"->Orange"); break;
            case "Y": System.out.println(str+"->Yellow"); break;
            case "W": System.out.println(str+"->White"); break;
        }
    }
}