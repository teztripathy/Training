/** Initialize an integer array with ascii values and print the corresponding character values in a single row.
 */
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        System.out.println("ASCII Value of digits 48-57");
        System.out.println("ASCII Value of UpperCase Character 65-90");
        System.out.println("ASXII Value of LowerCase Character 97-122");
        System.out.println("Number of Character:   ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Give the ASCII Values");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            System.out.print((char) arr[i]);
        }
    }
}