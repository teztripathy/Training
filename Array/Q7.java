/** Write a program to remove the duplicate elements in an array and print
 */

import java.util.*;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the size of the Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Give the array elements");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        //Arrays.sort(arr);
        int arr1[] = new int[n];
        int k =0;
        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++)
                if(arr[i]==arr[j]) {
                    arr1[k] = j;
                    k++;
                }
        }
        System.out.println(" ");
        System.out.println(k);
        System.out.println(" ");

        int arr2[] = new int[k-1];
        for(int i=0; i<k-1; i++) {
            arr2[i]=arr1[i];
        }
        Array.sort(arr2);
        int result[] = new int[n-k+1];
        for(int i=0; i<n; i++) {
            if(i!=arr2[i])
        }
    }
}