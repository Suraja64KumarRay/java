// A number is a Harshad number if it is divisible by the sum of its digits. Ex :- 18 % (1+8)=18 % 9 = 2

import java.util.Scanner;

public class HarshadNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int originalNum = n;

        while (n > 0) {
            int digit =  n % 10;
            sum += digit;
            n /= 10;
        }
        if (originalNum > 0 && originalNum % sum == 0) {
            System.out.println("Harshad number.");
        }
        else {
            System.out.println("Not a Harshad number.");
        }
    }
}
