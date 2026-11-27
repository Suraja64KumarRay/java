// Problem: Check whether a number reads the same forward and backward.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int originalNum = n;
        int reverse = 0;
        
        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        if (originalNum == reverse) {
            System.out.println("Palindrome number.");
        }
        else {
            System.out.println("Not a palindrome number.");
        }
        sc.close();
    }
}
