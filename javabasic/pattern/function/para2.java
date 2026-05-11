import java.util.*;
public class para2 {

    public static void calcsum(int x,int y)
    {
        int sum=x+y;
        System.out.println("sum is :"+sum);
    }

    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a :");
        int a=sc.nextInt();
        System.out.println("enter b :");
        int b=sc.nextInt();
        calcsum(a, b);
    }
}