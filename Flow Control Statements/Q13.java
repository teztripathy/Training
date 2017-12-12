/** Write a program to print prime numbers between 10 and 99.
 */

public class Q13 {
    static boolean isPrime(int x) {
        if (x%2==0) 
            return false;
        else {
            for(int i=2; i<=Math.sqrt(x); i++) {
                if(x%i==0)
                    return false;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        for(int i=10; i<99; i++) {
            if(isPrime(i))
                System.out.print(i+" ");
        }
    }
}