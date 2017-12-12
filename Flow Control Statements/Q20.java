/**Write a program that displays a menu with options 1. Add 2. Sub
Based on the options chosen, read 2 numbers and perform the relevant operation.
After performing the operation, the program should ask the user if he wants to continue. 
If the user presses y or Y, then the program should continue displaying the menu else the program should terminate.
[ Note: Use Scanner class, you can take help from the trainer regarding the same ] */

import java.util.*;
public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1;
        do {
            System.out.println("Give two numbers for Addition and Subtraction Operation");
            System.out.print("Give First Number:  ");
            int a = sc.nextInt();
            System.out.print("Give Second Number:  ");
            int b = sc.nextInt();
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            int op = sc.nextInt();
            switch(op) {
                case 1: System.out.println(a+b); break;
                case 2: System.out.println(a-b); break;
            }
            System.out.println("To continue the operation press Y or y");
            str1 = sc.next();
        }
        while(str1.equals("y")||str1.equals("Y"));
    }
}