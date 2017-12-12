/** Write a program to check if a given number is prime or not
 */
public class Q12 {
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
        System.out.println(isPrime(Integer.parseInt(args[0]))?"Prime":"Not Prime");
    }
}