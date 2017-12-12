/** Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array
 */

import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        System.out.print("Give the size of the Array ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Give the array elements");
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        int max1=0;
        int max2=0;
        int min1=2147483647;
        int min2=2147483647;  /**Any Big number is acceptable, here it is 2**31 */
        for(int i=0; i<n; i++) {
            max1 = max1<arr[i]?arr[i]:max1;
            min1 = min1>arr[i]?arr[i]:min1;
        }
        for(int i=0; i<n; i++) {
            max2 = max2<arr[i] && arr[i]!=max1?arr[i]:max2;
            min2 = min2>arr[i] && arr[i]!=min1?arr[i]:min2;
        }
        System.out.println(" ");
        System.out.println("Maximum   "+max1);
        System.out.println("Second Maximum  "+max2);
        System.out.println("Minumum    "+min1);
        System.out.println("Second Minimum   "+min2);
    }
}