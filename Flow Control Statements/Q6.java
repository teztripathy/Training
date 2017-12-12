/**
 * Write a program to accept gender ("Male" or "Female") and age (1-120) from command line arguments and print the percentage of interest based on the given conditions.
Interest == 8.2% 
 Gender ==> Female
 Age    ==>1 to 58
Interest == 7.6% 
 Gender ==> Female
 Age    ==>59 -120
Interest == 9.2% 
 Gender ==> Male
 Age    ==>1-60
Interest == 8.3% 
 Gender ==> Male
 Age    ==>61-120
 */

public class Q6 {
    public static void main(String[] args) {
        char g = args[0].charAt(0);
        int a = Integer.parseInt(args[1]);
        System.out.println(g=='F'?a>=1&&a<=58?"8.2%":"7.6%":g=='M'&&a>=1&&a<=60?"9.2%":"8.3%");
    }
}


