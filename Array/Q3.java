/**Write a program to initialize an integer array with values and check if a given number is present in the array or not. If the number is not found, it will print -1 else it will print the index value of the given  number in the array
Ex1) Array elements are  {1,4,34,56,7} and the search element is 90
O/P: -1
Ex2)Array elements are  {1,4,34,56,7} and the search element is 56
O/P: 4  */

import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        System.out.println("Give the size of the Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Give Array Elements");
        int arr[] = new int[n];
        for(int i =0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Give the Serach Element");
        int s = sc.nextInt();
        int cheat =-1;
        for(int i=0; i<arr.length; i++)
            if(arr[i]==s){
                cheat=i;
                break;
            }
        System.out.println(cheat==-1?"[-1]  Item not found":"["+cheat+"]"+"  Iten found");
    }
}