/**Write a program to initialize an integer array and print the sum and average of the array */
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        System.out.println("Give the size of the Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Give Array Elements");
        int arr[] = new int[n];
        for(int i =0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum=0, avg;
        for(int i=0; i<n; i++) {
            sum += arr[i];
        }
        avg = sum/n;
        System.out.println("Summation is:  "+sum);
        System.out.println("Average is:  "+avg);
    }
}