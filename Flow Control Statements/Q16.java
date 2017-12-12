/**Write a program to print * in Floyds format (using for and while loop)

*
*  *
*  *   *

*/

public class Q16 {
    public static void main(String[] args) {
        for(int i=1; i<=Integer.parseInt(args[0]); i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j==Integer.parseInt(args[0])?"*":"* ");
            }
        System.out.println();
        }
    }
}