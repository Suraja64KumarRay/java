import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = a , y = b;    // x and y For LCM

        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;

        System.out.println("GCD : "+gcd);
        System.out.println("LCM : "+(x * y)/gcd);  // [(x / gcd) * y] => x * y can overflow int for large inputs before the division happens. Dividing first keeps the numbers small.

    }
}