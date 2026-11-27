import java.util.Scanner;

public class Armstrong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int originalNum = n;
        int count = 0;

        int temp = n;

        while (temp > 0) {
            count ++;
            temp /= 10;
        }

        temp = n;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, count);
            temp /= 10;
        }

        if (sum == originalNum) {
            System.out.println("Armstrong number.");
        }
        else {
            System.out.println("Not an Armstrong number.");
        }
        sc.close();
    }
}
