import java.util.*;

public class switching {

    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); 
        
        switch(number)
        {
            case 1: System.out.println("mango");
                     break;
            case 2: System.out.println("orange");
                     break;
            case 3: System.out.println("apple");
                     break;
            default : System.out.println("nothing is needed");
        }
    }
}