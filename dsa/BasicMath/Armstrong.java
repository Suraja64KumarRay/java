// An Armstrong number is equal to the sum of its digits, each raised to the power of the total number of digits.
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int originalNum = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum = sum + (digit * digit * digit);
            n /= 10;
        }
        if (originalNum == sum) {
            System.out.println("Armstrong number.");
        }
        else {
            System.out.println("Not an Armstrong number.");
        }
        sc.close();
    }
}
