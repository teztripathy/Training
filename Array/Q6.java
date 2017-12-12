/** Write a program to initialize an array and print them in a sorted fashion
 */

import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the size of the Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("\nAfter Sorting\n");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}