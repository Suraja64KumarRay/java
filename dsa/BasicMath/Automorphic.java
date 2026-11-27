// An Automorphic number is a number whose square ends with the original number. Ex :- 76² = 5776

import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int square = n * n;
        int temp = n;
        int divisor = 1;
        
        while (temp > 0) {
            divisor *= 10;
            temp /= 10;
        }
        if (square % divisor == n) {
            System.out.println("Automorphic number.");
        }
        else {
            System.out.println("Not a Automorphic number.");
        }
        sc.close();
    }
}
