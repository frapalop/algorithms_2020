import java.math.*;

public class Karatsuba {
    public static void main(String[] args) {
        System.out.println("Initialize arrays");
       
        BigInteger n1 = 	new BigInteger("3141592653589793238462643383279502884197169399375105820974944592");
        BigInteger n2 = 	new BigInteger("2718281828459045235360287471352662497757247093699959574966967627");
        BigInteger result;
       
        result = TESTING.getMul(n1, n2);

        System.out.println("Reuslt should be: ");        
        System.out.println(result);
         

    }
}