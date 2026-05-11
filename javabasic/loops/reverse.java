import java.util.*;

public class reverse {
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
       
        Scanner sc = new Scanner(System.in);
         System.out.println("enter a number :");
        int number = sc.nextInt();

        //int rev=0;
        while(number > 0)
        {
            int lastdig=number%10;
            System.out.print(lastdig);  //rev = rev*10 + lastdig;
            number=number/10;
        }
        System.out.println();
    }
}