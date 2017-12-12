/**
 * Write a program to convert from upper case to lower 
 * case and vice versa of an alphabet and print the old character and new character 
 * as shown in example (Ex: a->A, M->m).
 */
import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        System.out.println(Character.isUpperCase(str.charAt(0))?str+"->"+str.toLowerCase():str+"->"+str.toUpperCase());
    }
}