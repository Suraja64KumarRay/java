//In Fibonacci, each number is the sum of the previous two numbers.Ex :- 0,1,1,2,3,5,8,13,21...

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for(int i=1;i<=n;i++) {
            System.out.println(a+" ");

            int c = a+b;

            a=b;
            b=c;
        }
        sc.close();
    }
}
