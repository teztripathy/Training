/*
 Write a program to check if the program has received command line arguments or not. If the program has not received the values then print "No Values", else print all the values in a single line separated by ,(comma).
*/

public class Q3 {
    public static void main(String args[]) {
        String str="";
        if(args.length==0)
            str = "No Value";
        else {
            for(int i=0; i<args.length; i++) {
                str = i<args.length-1?str+args[i]+",":str+args[i];
            }
        }
        System.out.println(str);
    }
}