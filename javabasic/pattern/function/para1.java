import java.util.*;
public class para1 {
    public static void calcsum()
    {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a :");
        int a = sc.nextInt();
        System.out.println("enter b :");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("sum is : "+sum);
    }
    public static void main(String[] args)
    {
       calcsum();
    }
}
