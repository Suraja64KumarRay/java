import java.math.BigInteger;
import java.util.Scanner;

public class Fact2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        BigInteger fact = BigInteger.ONE;

        for(int i=2;i<=n;i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        System.out.println(fact);

        sc.close();
    }
}

// factorial starts as BigInteger.ONE (1).
// For n = 0, the loop condition 2 <= 0 is false, so the loop body never runs.
// For n = 1, the condition 2 <= 1 is false, so again the loop never runs.
// Either way, it prints the starting value: 1.