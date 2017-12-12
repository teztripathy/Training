/*
Intialize a character variable in a program and if the value is alphabet then print "Alphabet" if it’s a number then print "Digit" and for other characters print "Special Character"
*/

public class Q5 {
    public static void main(String args[]) {
        char c = args[0].charAt(0);
        System.out.println((c>=65&&c<=90)||(c>=97&&c<=122)?"Alphabet":(c>=48&&c<=57)?"Number":(c>=32&&c<=47)?"Special Character":"NA");
    }
}