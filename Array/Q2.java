/**Write a program to initialize an integer array and find the maximum and minimum value of an array */
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        System.out.println("Give the size of the Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Give Array Elements");
        int arr[] = new int[n];
        for(int i =0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum of the Array is");
        int max=0;
        for(int i=0; i<n; i++) {
            if(max<arr[i])
                max=arr[i];
        }
        System.out.println(max);
        System.out.println("Minimum of the Array is");
        int min=2147483647; //maximum size of integer
        for(int i=0; i<n; i++) {
            if(min>arr[i])
                min=arr[i];
        }
        System.out.println(min);
    }
}