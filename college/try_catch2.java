import java.util.*;
public class try_catch2 {
    public static void main(String[] args) {
        try {
            int a,b;
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number :");
            a = sc.nextInt();
            System.out.println("Enter second number :");
            b = sc.nextInt();

            int result = a/b;
            System.out.println("Result :"+result);
        }
        catch(ArithmeticException e) {
            System.out.println("Error : Can not be divided by zero!");
        }
    }
}
