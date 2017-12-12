/**Write a program to reverse a given number and print using while loop...
Eg1)
I/P: 1234
O/P:4321
Eg2)
I/P:1004
O/P:4001 */
import java.lang.StringBuffer;
public class Q17 {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        while(i>=1) {
            System.out.print(i%10);
            i /= 10;
        }
    }
}