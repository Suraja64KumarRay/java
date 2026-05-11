import java.util.*;

    public class oddev {
    
        public static void main(String[] args)
        {
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();

            if(number %2 == 0)
            {
                System.out.println("Even");
            }
            else
            {
                System.out.println("Odd");
            }
        }
    }
