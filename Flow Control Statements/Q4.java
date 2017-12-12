/*
Initialize two character variables in a program and display the characters in alphabetical order.
*/

public class Q4 {
    public static void main(String args[]) {
        char a = args[0].charAt(0);
        char b = args[1].charAt(0);
        String str1 = Character.toString(a) +","+ Character.toString(b);
        String str2 = Character.toString(b) +","+ Character.toString(a);
        System.out.println(a<b?str1:str2);
    }
}