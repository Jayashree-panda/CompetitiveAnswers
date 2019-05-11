import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class long_factorials {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {

        BigInteger f = new BigInteger("1"); // Or BigInteger.ONE 
  
        // Multiply f with 2, 3, ...N 
        for (int i = 2; i <= n; i++) 
            f = f.multiply(BigInteger.valueOf(i)); 
  
        System.out.println(f);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
}
