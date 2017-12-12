/**
 *  Write a program to add all the values in a given number and print. Ex: 1234->10
 */

public class Q15 {
    public static void main(String[] args) {
        int temp =0;
        for(int i=Integer.parseInt(args[0]); i>=1; i=i/10) {
            temp += i%10;
        }
        System.out.println(args[0]+"->"+temp);
    }
}