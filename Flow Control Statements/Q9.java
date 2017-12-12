/**  Write a program to print month in words, based on input month in numbers
 */

public class Q9 {
    public static void main(String[] args) {
        String months[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println(months[Integer.parseInt(args[0])-1]);
    }
}