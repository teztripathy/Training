/**Write a Java program to find if the given number is palindrome or not

Example1:

     C:\>java Sample 110011

     O/P Expected : 110011 is a palindrome

Example2:

     C:\>java Sample 1234

     O/P Expected : 1234 is not a palindrome */

public class Q18 {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        int k = args[0].length()-1;
        int j=0;
        while(i>=1) {
            j += (i%10)*Math.pow(10, k);
            i /= 10;
            k--;
        }
        System.out.println(j==Integer.parseInt(args[0])?"Paliandrome":"Not a Paliandrome");
    }
}