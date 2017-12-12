/*
Write a program to check if a given number is Positive, Negative, or Zero.
*/

public class Q1 {
    public static void main(String args[]) {
        int x = Integer.parseInt(args[0]);          /*Input as Command Line Argument*/
        System.out.println(x>0?"Positive":x<0?"Negative":"Zero");
    }
}