/*
 Write a program to check if a given number is odd or even.
*/

public class Q2 {
    public static void main(String args[]) {
        int x = Integer.parseInt(args[0]);          /*Input as Command Line Argument*/
        System.out.println(x%2==0?"Even":"Odd");
    }
}