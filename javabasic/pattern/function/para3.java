import java.util.*;

public class para3 {
    public static int calcsum(int x,int y)    // Formal parameters
    {
        int sum=x+y;
        return sum; 
    }
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a :");
        int a = sc.nextInt();
        System.out.println("enter b :");
        int b = sc.nextInt();
        int add=calcsum(a, b);               //Arguments or Actual parmeters
        System.out.println("sum of a and b is :"+add);
    }
}
